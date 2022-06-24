package com.stricarico.bmicalculator.person;

import javax.persistence.*;

@Entity
@Table
public class Person {

    @Id
    @SequenceGenerator(
            name= "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    private Long id;
    private String name;
    private Float height;
    private Float weight;
    @Transient
    private Float bmi;

    public Person() {
    }

    public Person(Long id, String name, Float height, Float weight) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, Float height, Float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getBmi() {
        return getWeight() / (float) Math.pow(getHeight(), 2);
    }

    public void setBmi(Float bmi) {
        this.bmi = bmi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", bmi=" + bmi +
                '}';
    }
}
