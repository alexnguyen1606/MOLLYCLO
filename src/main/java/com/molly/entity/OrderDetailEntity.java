package com.molly.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderdetail")
public class OrderDetailEntity extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "orderid")
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "productid")
    private ProductEntity product;
    @Column(name = "quantity")
    private int quantity;

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
