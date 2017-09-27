package io.fdlessard.codebites.equals.implementations.manual;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void testEqualsWithJqnoEqualsVerifier()  {
        EqualsVerifier.forClass(Customer.class)
                //    .withRedefinedSubclass(ExtendedAddress.class)
                .verify();
    }

}