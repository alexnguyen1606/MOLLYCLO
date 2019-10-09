package com.molly.dto;

import com.molly.entity.ImageEntity;
import com.molly.entity.ProductEntity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CollectionDTO extends BaseDTO{

    private String name;

    private Date collectionDate;

    private Set<ProductDTO> listProduct = new HashSet<>();

    private Set<ImageDTO> listImage = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public Set<ProductDTO> getListProduct() {
        return listProduct;
    }

    public void setListProduct(Set<ProductDTO> listProduct) {
        this.listProduct = listProduct;
    }

    public Set<ImageDTO> getListImage() {
        return listImage;
    }

    public void setListImage(Set<ImageDTO> listImage) {
        this.listImage = listImage;
    }
}
