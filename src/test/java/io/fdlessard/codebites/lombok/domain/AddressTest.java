package io.fdlessard.codebites.lombok.domain;

import io.fdlessard.codebites.lombok.TestConstants;
import org.junit.Before;
import org.junit.Test;

import static io.fdlessard.codebites.lombok.TestConstants.*;
import static org.junit.Assert.*;

public class AddressTest {

    private Address address;

    @Before
    public void setUp() {
        address = Address.builder()
                .streetName(TEST_STREET_NAME)
                .city(TEST_CITY)
                .province(TEST_PROVINCE)
                .postalCode(TEST_POSTAL_CODE)
                .country(TEST_COUNTRY)
                .build();
    }

    @Test
    public void testGetSet() {
        Address otherAddress = Address.builder()
                .build();

        otherAddress.setStreetName(TEST_STREET_NAME);
        assertEquals(TEST_STREET_NAME, otherAddress.getStreetName());

        otherAddress.setCity(TEST_CITY);
        assertEquals(TEST_CITY, otherAddress.getCity());

        otherAddress.setProvince(TEST_PROVINCE);
        assertEquals(TEST_CITY, otherAddress.getCity());

        otherAddress.setPostalCode(TEST_POSTAL_CODE);
        assertEquals(TEST_POSTAL_CODE, otherAddress.getPostalCode());

        otherAddress.setCountry(TEST_COUNTRY);
        assertEquals(TEST_COUNTRY, otherAddress.getCountry());
    }

    @Test
    public void testToString() {
        assertEquals("Address(streetName=A street name, city=A city, province=A province, postalCode=A postal code, country=A country)", address.toString());
    }

    @Test
    public void testEquals() {
        assertTrue(address.equals(address));
        Address otherAddress = Address.builder()
                .build();

        assertFalse(address.equals(otherAddress));

    }

}