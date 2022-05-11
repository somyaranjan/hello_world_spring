package com.somyaranjan.hello_world.model;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String name;
    private int age;
    
}
