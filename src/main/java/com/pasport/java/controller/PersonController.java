package com.pasport.java.controller;

import com.pasport.java.entity.Person;
import com.pasport.java.servise.PersonServise;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/person")
@AllArgsConstructor
public class PersonController {
    @Qualifier(value = "Qualifier")
    Person person;

    PersonServise personServise;

//    @GetMapping
//    public List<Person> addAll() {
//      return personServise.findAll();
//    }

    @GetMapping
    public List<Person> findAllQuery() {
        return personServise.findAllQuery();
    }

    @PostMapping
    public Person newPerson(@RequestBody Person person) {
        return personServise.newPerson(person);
    }

    @GetMapping("/{id}")
    public List<Person> findByPerson(@PathVariable int id) {
        return personServise.findByPerson(id);
    }

    @GetMapping("/dict")
    public List<Person> distPerson() {
        return personServise.distPerson();
    }

    @GetMapping("/fnameLname")
    public List<Person> getFnameLname() {
        return personServise.getFnameLname();
    }

    @GetMapping("/getPersonPassport")
    public Person getPersonPassport(@PathVariable int passport) {
        return personServise.getPersonPassport(passport);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable int id, @RequestBody Person person) {
        return personServise.updatePerson(id);

    }

    @PostMapping("/{fnmae}/{lname}/{passport}")
    public Person addPerson(@PathVariable Person person) {
        return personServise.addPerson(person);
    }

    @DeleteMapping("/{id}")
    public Person deletePerson(@PathVariable int id) {
        return personServise.deletePerson(id);
    }




}
