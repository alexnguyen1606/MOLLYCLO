package com.molly.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "collection")
public class CollectionEntity extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "collectiondate")
    private Date collectionDate;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "collection",cascade = CascadeType.ALL)
    private Set<ProductEntity> listProduct = new HashSet<>();
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "collection",cascade = CascadeType.ALL)
    private Set<ImageEntity> listImage = new HashSet<>();

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

    public Set<ProductEntity> getListProduct() {
        return listProduct;
    }

    public void setListProduct(Set<ProductEntity> listProduct) {
        this.listProduct = listProduct;
    }

    public Set<ImageEntity> getListImage() {
        return listImage;
    }

    public void setListImage(Set<ImageEntity> listImage) {
        this.listImage = listImage;
    }
}
