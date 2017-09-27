package io.fdlessard.codebites.equals.implementations.manual;

import io.fdlessard.codebites.equals.implementations.apache.Address;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testEqualsWithJqnoEqualsVerifier()  {
        EqualsVerifier.forClass(Address.class)
                //    .withRedefinedSubclass(ExtendedAddress.class)
                .verify();
    }
}