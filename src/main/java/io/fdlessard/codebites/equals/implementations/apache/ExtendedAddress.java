package io.fdlessard.codebites.equals.implementations.apache;

import io.fdlessard.codebites.equals.implementations.lombok.Address;

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
        if (this == o) return true;
        if (!(o instanceof ExtendedAddress)) return false;
        if (!super.equals(o)) return false;

        ExtendedAddress that = (ExtendedAddress) o;

        return county != null ? county.equals(that.county) : that.county == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (county != null ? county.hashCode() : 0);
        return result;
    }
}
