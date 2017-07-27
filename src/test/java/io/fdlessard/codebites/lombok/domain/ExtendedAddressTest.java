package io.fdlessard.codebites.lombok.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static io.fdlessard.codebites.lombok.TestConstants.*;
import static org.junit.Assert.*;

public class ExtendedAddressTest {

    private ExtendedAddress extendedAddress;

    @Before
    public void setUp() {
        extendedAddress = ExtendedAddress.builder()
                .streetName(TEST_STREET_NAME)
                .city(TEST_CITY)
                .province(TEST_PROVINCE)
                .postalCode(TEST_POSTAL_CODE)
                .country(TEST_COUNTRY)
                .county(TEST_COUNTY)
                .build();
    }

    @Test
    public void testGetSet() {
        ExtendedAddress otherExtendedAddress = ExtendedAddress.builder()
                .build();

        otherExtendedAddress.setStreetName(TEST_STREET_NAME);
        assertEquals(TEST_STREET_NAME, otherExtendedAddress.getStreetName());

        otherExtendedAddress.setCity(TEST_CITY);
        assertEquals(TEST_CITY, otherExtendedAddress.getCity());

        otherExtendedAddress.setProvince(TEST_PROVINCE);
        assertEquals(TEST_CITY, otherExtendedAddress.getCity());

        otherExtendedAddress.setPostalCode(TEST_POSTAL_CODE);
        assertEquals(TEST_POSTAL_CODE, otherExtendedAddress.getPostalCode());

        otherExtendedAddress.setCountry(TEST_COUNTRY);
        assertEquals(TEST_COUNTRY, otherExtendedAddress.getCountry());

        otherExtendedAddress.setCounty(TEST_COUNTY);
        assertEquals(TEST_COUNTY, otherExtendedAddress.getCounty());
    }

    @Test
    public void testToString() {
        assertEquals("ExtendedAddress(super=Address(streetName=A street name, city=A city, province=A province, postalCode=A postal code, country=A country), county=A county)", extendedAddress.toString());
    }

    @Test
    public void testEquals() {
        assertTrue(extendedAddress.equals(extendedAddress));
        ExtendedAddress otherExtendedAddress = ExtendedAddress.builder()
                .build();

        assertFalse(extendedAddress.equals(otherExtendedAddress));
    }

    @Test
    public void marshalling() throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        String jsonString = objectMapper.writeValueAsString(extendedAddress);

        assertEquals("{\"streetName\":\"A street name\",\"city\":\"A city\",\"province\":\"A province\",\"postalCode\":\"A postal code\",\"country\":\"A country\",\"county\":\"A county\"}", jsonString);
    }

    @Test
    public void marshallingWithMixins() throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.addMixIn(ExtendedAddress.class, AddressMixIn.class);

        String jsonString = objectMapper.writeValueAsString(extendedAddress);


        assertEquals("{\"city\":\"A city\",\"province\":\"A province\",\"postalCode\":\"A postal code\",\"country\":\"A country\",\"county\":\"A county\",\"nomDeRue\":\"A street name\"}", jsonString);

    }
}