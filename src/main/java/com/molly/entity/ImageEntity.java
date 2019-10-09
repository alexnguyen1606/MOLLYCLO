package com.molly.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class ImageEntity extends BaseEntity{
    @Column(name = "href")
    @Type(type = "text")
    private String href;
    @ManyToOne
    @JoinColumn(name = "productid",nullable = true)
    private ProductEntity product;
    @ManyToOne
    @JoinColumn(name = "collectionid",nullable = true)
    private CollectionEntity collection;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public CollectionEntity getCollection() {
        return collection;
    }

    public void setCollection(CollectionEntity collection) {
        this.collection = collection;
    }
}
