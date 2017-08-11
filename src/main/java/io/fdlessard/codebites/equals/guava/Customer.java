package io.fdlessard.codebites.equals.guava;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import io.fdlessard.codebites.equals.lombok.Address;

import java.util.List;
import java.util.UUID;

public class Customer {

    private UUID id;

    private String firstName;

    private String lastName;

    private String company;

    private List<Address> addresses;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equal(id, customer.id) &&
                Objects.equal(firstName, customer.firstName) &&
                Objects.equal(lastName, customer.lastName) &&
                Objects.equal(company, customer.company) &&
                Objects.equal(addresses, customer.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, firstName, lastName, company, addresses);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("company", company)
                .add("addresses", addresses)
                .toString();
    }
}
