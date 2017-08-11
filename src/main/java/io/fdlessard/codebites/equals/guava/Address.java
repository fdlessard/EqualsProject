package io.fdlessard.codebites.equals.guava;


import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Address {

    private String streetName;

    private String city;

    private String province;

    private String postalCode;

    private String country;

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
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equal(streetName, address.streetName) &&
                Objects.equal(city, address.city) &&
                Objects.equal(province, address.province) &&
                Objects.equal(postalCode, address.postalCode) &&
                Objects.equal(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(streetName, city, province, postalCode, country);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("streetName", streetName)
                .add("city", city)
                .add("province", province)
                .add("postalCode", postalCode)
                .add("country", country)
                .toString();
    }
}
