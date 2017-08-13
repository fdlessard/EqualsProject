package io.fdlessard.codebites.equals.objectutil;

import io.fdlessard.codebites.equals.lombok.Address;

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
