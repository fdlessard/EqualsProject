package io.fdlessard.codebites.equals.implementations.lombok;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class Customer implements Serializable {

    private UUID id;

    private String firstName;

    private String lastName;

    private String company;

    private List<Address> addresses;

}
