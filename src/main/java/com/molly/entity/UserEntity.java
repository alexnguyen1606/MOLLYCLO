package com.molly.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Table(name = "users")
@Entity
public class UserEntity extends BaseEntity {
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String passWord;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "phonenumber")
    private String phoneNumber;
    @Column(name = "birthday")
    private Date birthDay;

    @Column(name = "active")
    private boolean active;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "userrole",joinColumns = {@JoinColumn(name = "userid")},
        inverseJoinColumns = {@JoinColumn(name = "roleid")})
    private Set<RoleEntity> roleEntities = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user",cascade = CascadeType.REMOVE)
    private Set<AddressEntity> listAddress = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private Set<OrderEntity> listOrder = new HashSet<>();

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<OrderEntity> getListOrder() {
        return listOrder;
    }

    public void setListOrder(Set<OrderEntity> listOrder) {
        this.listOrder = listOrder;
    }

    public Set<AddressEntity> getListAddress() {
        return listAddress;
    }

    public void setListAddress(Set<AddressEntity> listAddress) {
        this.listAddress = listAddress;
    }

    public Set<RoleEntity> getRoleEntities() {
        return roleEntities;
    }

    public void setRoleEntities(Set<RoleEntity> roleEntities) {
        this.roleEntities = roleEntities;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }


}
