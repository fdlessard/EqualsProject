package io.fdlessard.codebites.equals.manual;

import io.fdlessard.codebites.equals.manual.Customer;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void testEquals()  {
        EqualsVerifier.forClass(Customer.class)
                //    .withRedefinedSubclass(ExtendedAddress.class)
                .verify();
    }

}