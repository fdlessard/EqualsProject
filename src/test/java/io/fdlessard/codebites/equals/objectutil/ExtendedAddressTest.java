package io.fdlessard.codebites.equals.objectutil;

import io.fdlessard.codebites.equals.objectutil.ExtendedAddress;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class ExtendedAddressTest {

    @Test
    public void testEquals()  {
        EqualsVerifier.forClass(ExtendedAddress.class)
                //    .withRedefinedSubclass(ExtendedAddress.class)
                .verify();
    }
}