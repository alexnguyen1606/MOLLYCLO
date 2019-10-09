package com.molly.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ProductDTO extends BaseDTO {
    private String name;

    private CollectionDTO collection;

    private int price;

    private int inventory;

    private String material;

    private String tailored;

    private String form;

    private String wash;

    private Set<OrderDetailDTO> listOrderDetail = new HashSet<>();

    private Set<SizeDTO> listSize = new HashSet<>();

    private Set<ImageDTO> listImage = new HashSet<>();
}
