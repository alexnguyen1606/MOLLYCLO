package com.molly.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;
@Data
public class OrderDTO extends BaseDTO{
    private UserDTO user;

    private Set<OrderDetailDTO> listOrderDetail = new HashSet<>();


    private int totalPrice;

    private String description;
}
