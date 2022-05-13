package com.somyaranjan.hello_world.model;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class User {
    @Id
    private int id;
    private String name;
    private int age;
    
}
