package ru.schooltest.testschool.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class student {

    @Id
@GeneratedValue
    private Long id;
    private String name;
    private int age;
}
