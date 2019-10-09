package com.molly.entity;

import javax.persistence.*;

@Table(name = "size")
@Entity
public class SizeEntity extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "productid")
    private ProductEntity product;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "numberofstock")
    private int numberOfStock;

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStock() {
        return numberOfStock;
    }

    public void setNumberOfStock(int numberOfStock) {
        this.numberOfStock = numberOfStock;
    }
}
