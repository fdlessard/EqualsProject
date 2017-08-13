package io.fdlessard.codebites.equals.apache;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testEquals()  {
        EqualsVerifier.forClass(Customer.class)
                //    .withRedefinedSubclass(ExtendedAddress.class)
                .verify();
    }

}