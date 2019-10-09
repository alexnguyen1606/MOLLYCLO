package com.molly.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class AddressEntity extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity user;
    @Column(name = "defaultaddress")
    private boolean defaultAddress;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "district")
    private String district;
    @Column(name = "ward")
    private String ward;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public boolean isDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(boolean defaultAddress) {
        this.defaultAddress = defaultAddress;
    }
}
