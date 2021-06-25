package com.onlinestore.store.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table (name = "user_table")
@Entity
@Data
@ToString(exclude = "password") // i dont want to show my password because its sensitive information..
public class UserEntity extends BaseEntity{

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String password;

    @Column
    private String role;

    @Column
    private String address;

}
