package io.fdlessard.codebites.equals.objectutil;

import io.fdlessard.codebites.equals.objectutil.Customer;
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