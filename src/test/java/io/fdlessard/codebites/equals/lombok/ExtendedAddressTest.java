package io.fdlessard.codebites.equals.lombok;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.fdlessard.codebites.equals.TestConstants;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtendedAddressTest {

    private ExtendedAddress extendedAddress;

    @Before
    public void setUp() {
        extendedAddress = ExtendedAddress.builder()
                .streetName(TestConstants.TEST_STREET_NAME)
                .city(TestConstants.TEST_CITY)
                .province(TestConstants.TEST_PROVINCE)
                .postalCode(TestConstants.TEST_POSTAL_CODE)
                .country(TestConstants.TEST_COUNTRY)
                .county(TestConstants.TEST_COUNTY)
                .build();
    }

    @Test
    public void testGetSet() {
        ExtendedAddress otherExtendedAddress = ExtendedAddress.builder()
                .build();

        otherExtendedAddress.setStreetName(TestConstants.TEST_STREET_NAME);
        assertEquals(TestConstants.TEST_STREET_NAME, otherExtendedAddress.getStreetName());

        otherExtendedAddress.setCity(TestConstants.TEST_CITY);
        assertEquals(TestConstants.TEST_CITY, otherExtendedAddress.getCity());

        otherExtendedAddress.setProvince(TestConstants.TEST_PROVINCE);
        assertEquals(TestConstants.TEST_CITY, otherExtendedAddress.getCity());

        otherExtendedAddress.setPostalCode(TestConstants.TEST_POSTAL_CODE);
        assertEquals(TestConstants.TEST_POSTAL_CODE, otherExtendedAddress.getPostalCode());

        otherExtendedAddress.setCountry(TestConstants.TEST_COUNTRY);
        assertEquals(TestConstants.TEST_COUNTRY, otherExtendedAddress.getCountry());

        otherExtendedAddress.setCounty(TestConstants.TEST_COUNTY);
        assertEquals(TestConstants.TEST_COUNTY, otherExtendedAddress.getCounty());
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