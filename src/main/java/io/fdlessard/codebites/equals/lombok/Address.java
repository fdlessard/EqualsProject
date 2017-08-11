package io.fdlessard.codebites.equals.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor()
@Builder()
public class Address {

    private String streetName;

    private String city;

    private String province;

    private String postalCode;

    private String country;

}
