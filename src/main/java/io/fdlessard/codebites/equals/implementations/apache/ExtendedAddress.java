package io.fdlessard.codebites.equals.implementations.apache;

import io.fdlessard.codebites.equals.implementations.lombok.Address;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ExtendedAddress extends Address {

    private String county;


    public ExtendedAddress() {

    }

    public ExtendedAddress(String streetName, String city, String province, String postalCode, String country, String county) {
        super(streetName, city, province, postalCode, country);
        this.county = county;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }


    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;

        ExtendedAddress extendedAddress = (ExtendedAddress) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(county, extendedAddress.county)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(county)
                .toHashCode();
    }
}
