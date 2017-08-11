package io.fdlessard.codebites.equals.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ExtendedAddress extends Address {

    private String county;

    @Builder
    public ExtendedAddress(String streetName, String city, String province, String postalCode, String country, String county) {
        super(streetName, city, province, postalCode, country);
        this.county = county;
    }

    public static class ExtendedAddressBuilder extends AddressBuilder{
        ExtendedAddressBuilder() {
            super();
        }
    }

}
