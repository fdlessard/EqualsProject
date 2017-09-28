package io.fdlessard.codebites.equals.implementations.apache;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Address implements Serializable {

    private String streetName;

    private String city;

    private String province;

    private String postalCode;

    private String country;

    public Address() {
    }

    public Address(String streetName, String city, String province, String postalCode, String country) {
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return new EqualsBuilder()
                .append(streetName, address.streetName)
                .append(city, address.city)
                .append(province, address.province)
                .append(postalCode, address.postalCode)
                .append(country, address.country)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(streetName)
                .append(city)
                .append(province)
                .append(postalCode)
                .append(country)
                .toHashCode();
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("streetName", streetName)
                .append("city", city)
                .append("province", province)
                .append("postalCode", postalCode)
                .append("country", country)
                .toString();
    }
}
