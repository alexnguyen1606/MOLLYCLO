package com.molly.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "userrole",joinColumns = {@JoinColumn(name = "roleid")},
        inverseJoinColumns = {@JoinColumn(name = "userid")})
    private Set<UserEntity> userEntities = new HashSet<>();

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

    public Set<UserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(Set<UserEntity> userEntities) {
        this.userEntities = userEntities;
    }
}
