package com.pasport.java.servise;

import com.pasport.java.entity.Person;
import com.pasport.java.reposytory.PersonReposytory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //
@AllArgsConstructor

public class PersonServise {
    PersonReposytory personReposytory;

//    public List<Person> findAll() {
//        return personReposytory.findAll();
//    }

    public List<Person> findAllQuery() {
      return personReposytory.findAllQuery();
    }


    public Person newPerson(Person person) {
        return personReposytory.save(person);
    }

    public List<Person> findByPerson(int id) {
        return personReposytory.findPersonById(id);
    }

    public List<Person> distPerson() {
      return personReposytory.distinctPerson();
    }

    public List<Person> getFnameLname() {
        return  personReposytory.getFnameAndLname();
    }

    public Person getPersonPassport(int passport) {
        return personReposytory.getPersonPassport(passport);
    }

    public Person updatePerson(int id) {
        return personReposytory.updatePerson(id);
    }

    public Person addPerson(Person person) {
        return personReposytory.addPerson(person);
    }

    public Person deletePerson (int id) {
        return personReposytory.deletePerson(id);
    }


}
