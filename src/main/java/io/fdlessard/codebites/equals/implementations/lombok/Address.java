package io.fdlessard.codebites.equals.implementations.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor()
@Builder()
public class Address implements Serializable {

    private String streetName;

    private String city;

    private String province;

    private String postalCode;

    private String country;

}
