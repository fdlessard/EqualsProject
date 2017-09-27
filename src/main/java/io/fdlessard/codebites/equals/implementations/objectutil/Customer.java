package io.fdlessard.codebites.equals.implementations.objectutil;

import io.fdlessard.codebites.equals.implementations.lombok.Address;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Customer implements Serializable {

    private UUID id;

    private String firstName;

    private String lastName;

    private String company;

    private List<Address> addresses;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(company, customer.company) &&
                Objects.equals(addresses, customer.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, company, addresses);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", addresses=").append(addresses);
        sb.append('}');
        return sb.toString();
    }
}
