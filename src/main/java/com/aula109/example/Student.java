package com.aula109.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_tb")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Integer id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_age")
    private int age;

    public Student(){
        super();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return String.format("Estudante:\nIdentificador: %d\nNome: %s\nIdade: %d", id, name, age);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
