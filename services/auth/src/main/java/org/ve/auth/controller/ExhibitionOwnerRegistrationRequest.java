package org.ve.auth.controller;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ExhibitionOwnerRegistrationRequest {
    private String emailAddress;
    private String name;
    private String contactNo;
    private String nic;
    private String password;
    private String company;
}
