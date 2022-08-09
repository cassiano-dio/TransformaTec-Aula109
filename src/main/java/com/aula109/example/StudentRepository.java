package com.aula109.example;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer>{
    
    Student findByName(String name);

    Student findByAge(int age);

}
