package com.onlinestore.store.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

// All the entity classes will have a Id in the table. so we create a super class

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)// tells javax.persistence that this is the id in postgres
    private Integer id;
}
