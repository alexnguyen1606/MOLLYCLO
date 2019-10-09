package com.molly.dto;

import lombok.Data;

@Data
public class OrderDetailDTO extends BaseDTO{
    private OrderDTO order;

    private ProductDTO product;

    private int quantity;
}
