package io.fdlessard.codebites.equals.manual;

import io.fdlessard.codebites.equals.lombok.Address;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Customer implements Serializable {

    private UUID id;

    private String firstName;

    private String lastName;

    private String company;

    private List<Address> addresses;

}
