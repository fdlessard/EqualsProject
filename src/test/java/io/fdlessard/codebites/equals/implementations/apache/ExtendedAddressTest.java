package io.fdlessard.codebites.equals.implementations.apache;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ExtendedAddressTest {

    @Test
    public void testEqualsWithJqnoEqualsVerifier()  {
        EqualsVerifier.forClass(ExtendedAddress.class)
                //    .withRedefinedSubclass(ExtendedAddress.class)
                .verify();
    }



    @Test
    public void testEqualsForInheritance()  {

        Address address = new Address("streetName", "city", "province", "postalCode", "country" );
        ExtendedAddress extendedAddress = new ExtendedAddress("streetName", "city", "province", "postalCode", "country", "county" );


        assertFalse(address.equals(extendedAddress));
        assertFalse(extendedAddress.equals(address));

    }
}