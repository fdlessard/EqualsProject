package io.fdlessard.codebites.lombok.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private String streetName;

    private String city;

    private String province;

    private String postalCode;

    private String country;

}
