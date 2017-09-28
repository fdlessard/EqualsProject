package io.fdlessard.codebites.equals.implementations.apache;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void testEqualsWithJqnoEqualsVerifier()  {

        EqualsVerifier.forClass(Customer.class)
                .verify();
    }

}