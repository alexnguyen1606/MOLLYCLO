package com.molly.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class RoleDTO extends BaseDTO {

    private String code;

    private String name;

    private Set<UserDTO> userEntities = new HashSet<>();
}
