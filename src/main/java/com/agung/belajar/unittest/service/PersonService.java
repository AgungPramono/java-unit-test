package com.agung.belajar.unittest.service;

import com.agung.belajar.unittest.data.Person;
import com.agung.belajar.unittest.repository.PersonRepository;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id){
        Person person = personRepository.findById(id);
        if (person != null){
            return person;
        }else {
            throw new IllegalArgumentException("Person Not Found");
        }
    }
}
