package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaDao extends JpaRepository<Person, Integer> {
}
