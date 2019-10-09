package com.molly.dto;

import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class UserDTO extends BaseDTO {
    private String email;

    private String passWord;

    private String fullName;

    private String phoneNumber;

    private Date birthDay;


    private boolean active;

    private Set<RoleDTO> roleEntities = new HashSet<>();


    private Set<AddressDTO> listAddress = new HashSet<>();


    private Set<OrderDTO> listOrder = new HashSet<>();
}
