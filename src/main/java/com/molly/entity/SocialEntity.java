package com.molly.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "social")
@Data
public class SocialEntity extends BaseEntity {
    @Column(name = "href")
    @Type(type = "text")
    private String href;

}
