package com.example;

import org.springframework.web.bind.annotation.*;

/**
 * Created by danielbutts on 2/24/17.
 */

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonRepository repository;

    public PersonController (PersonRepository repository) {
        this.repository = repository;
    }

    @PostMapping("")
    public Person create(@RequestBody Person person) {
        this.repository.save(person);
        return person;
    }

    @GetMapping("")
    public Iterable<Person> list() {
        return this.repository.findAll();
    }
}
