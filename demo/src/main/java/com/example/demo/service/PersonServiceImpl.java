package com.example.demo.service;

import com.example.demo.dao.PersonJpaDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonJpaDao personJpaDao;

    @Override
    public Person getPerson(Integer id) {
        return personJpaDao.getOne(id);
    }
}
