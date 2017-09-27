package io.fdlessard.codebites.equals.implementations.apache;

import com.google.common.testing.EqualsTester;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class AddressTest {


    @Test
    public void testEqualsWithJqnoEqualsVerifier() {

        EqualsVerifier.forClass(Address.class)
               // .usingGetClass()
                .suppress(Warning.NONFINAL_FIELDS)
                //    .withRedefinedSubclass(ExtendedAddress.class)
                .verify();
    }

    @Test
    public void testEqualsWithGuavaEqualsVerifier() {

        Address address1 = new Address("streetName", "city", "province", "postalCode", "country");
        Address address2 = new Address("streetName", "city", "province", "postalCode", "country");
        new EqualsTester().addEqualityGroup(address1, address2).testEquals();
        new EqualsTester().addEqualityGroup(address1, new Address()).testEquals();


    }


}