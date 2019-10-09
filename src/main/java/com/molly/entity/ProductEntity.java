package com.molly.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "collectionid")
    private CollectionEntity collection;
    @Column(name = "price")
    private int price;
    @Column(name = "inventory")
    private int inventory;
    @Column(name = "material")
    private String material;
    @Column(name = "tailored")
    private String tailored;
    @Column(name = "form")
    private String form;
    @Column(name = "wash")
    private String wash;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
    private Set<OrderDetailEntity> listOrderDetail = new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "product",cascade = CascadeType.ALL)
    private Set<SizeEntity> listSize = new HashSet<>();
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "product",cascade = CascadeType.ALL)
    private Set<ImageEntity> listImage = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CollectionEntity getCollection() {
        return collection;
    }

    public void setCollection(CollectionEntity collection) {
        this.collection = collection;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTailored() {
        return tailored;
    }

    public void setTailored(String tailored) {
        this.tailored = tailored;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getWash() {
        return wash;
    }

    public void setWash(String wash) {
        this.wash = wash;
    }

    public Set<OrderDetailEntity> getListOrderDetail() {
        return listOrderDetail;
    }

    public void setListOrderDetail(Set<OrderDetailEntity> listOrderDetail) {
        this.listOrderDetail = listOrderDetail;
    }

    public Set<SizeEntity> getListSize() {
        return listSize;
    }

    public void setListSize(Set<SizeEntity> listSize) {
        this.listSize = listSize;
    }

    public Set<ImageEntity> getListImage() {
        return listImage;
    }

    public void setListImage(Set<ImageEntity> listImage) {
        this.listImage = listImage;
    }
}
