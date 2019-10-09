package com.molly.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "order")
public class OrderEntity extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity user;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "order",cascade = CascadeType.ALL)
    private Set<OrderDetailEntity> listOrderDetail = new HashSet<>();
    @Column(name = "totalprice")
    private int totalPrice;
    @Column(name = "description")
    private String description;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Set<OrderDetailEntity> getListOrderDetail() {
        return listOrderDetail;
    }

    public void setListOrderDetail(Set<OrderDetailEntity> listOrderDetail) {
        this.listOrderDetail = listOrderDetail;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
