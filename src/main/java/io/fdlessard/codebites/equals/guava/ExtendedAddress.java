package io.fdlessard.codebites.equals.guava;

import com.google.common.base.Objects;
import io.fdlessard.codebites.equals.lombok.Address;

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
        return Objects.equal(county, that.county);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), county);
    }
}
