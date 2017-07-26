package io.fdlessard.codebites.lombok.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class Customer {

    private UUID id;

    private String firstName;

    private String lastName;

    private String company;

    private List<Address> addresses;

}
