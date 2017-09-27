package io.fdlessard.codebites.equals.implementations.manual;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class ExtendedAddressTest {

    @Test
    public void testEqualsWithJqnoEqualsVerifier()  {
        EqualsVerifier.forClass(ExtendedAddress.class)
                //    .withRedefinedSubclass(ExtendedAddress.class)
                .verify();
    }
}