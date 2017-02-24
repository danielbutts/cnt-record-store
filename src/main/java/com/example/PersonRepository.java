package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by danielbutts on 2/24/17.
 */
public interface PersonRepository extends CrudRepository<Person,Long> {

    Person findByFirstName(String firstName);
}
