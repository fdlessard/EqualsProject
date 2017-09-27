package io.fdlessard.codebites.equals.implementations.objectutil;

import io.fdlessard.codebites.equals.implementations.lombok.Address;

import java.util.Objects;

public class ExtendedAddress extends Address {

    private String county;





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
        return Objects.equals(county, that.county);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), county);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExtendedAddress{");
        sb.append("county='").append(county).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
