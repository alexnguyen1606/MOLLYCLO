package com.molly.dto;

import lombok.Data;

@Data
public class SizeDTO extends BaseDTO {
    private ProductDTO product;

    private String code;

    private String name;

    private int numberOfStock;
}
