package com.agung.belajar.unittest.repository;

import com.agung.belajar.unittest.data.Person;

public interface PersonRepository {

    Person findById(String id);
}
