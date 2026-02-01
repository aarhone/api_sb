package com.arh.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

// create actual tables and col in DB here
// getter setter to use the private col from db
@Entity
@Getter
@Setter
public class Student {

    // define col as var here


    // @Id is used for primary key.
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

}
