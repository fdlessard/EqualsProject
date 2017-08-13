package io.fdlessard.codebites.equals.manual;

import io.fdlessard.codebites.equals.apache.Address;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    @Test
    public void testEquals()  {
        EqualsVerifier.forClass(Address.class)
                //    .withRedefinedSubclass(ExtendedAddress.class)
                .verify();
    }
}