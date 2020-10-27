package com.pasport.java.reposytory;

import com.pasport.java.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonReposytory extends JpaRepository<Person, Integer> {

    @Query(value = "select * from person",nativeQuery = true)
    List<Person> findAllQuery();

    @Query(value = "select * from person where id > ?1", nativeQuery = true)
    List<Person> findPersonById(int id);

    @Query(value = "select distinct fname from person", nativeQuery = true)
    List<Person> distinctPerson();

    @Query(value = "select fname,lname from person", nativeQuery = true)
    List<Person> getFnameAndLname();

    @Query(value = "select fname from person where  passport = ?1", nativeQuery = true)
    Person getPersonPassport(int passport);

    @Query(value = "update fname,lname, passport where id = ?1", nativeQuery = true)
    Person updatePerson(int id);

    @Query(value = "INSERT INTO person values (?1, ?2, ?3)", nativeQuery = true)
    Person addPerson(Person person);

    @Query(value = "delete from person where id = ?1", nativeQuery = true)
    Person deletePerson(int id);








//
//    @Query(value = "SELECT * FROM model WHERE id < :id", nativeQuery = true)
//    public List<Person> aaa(@Param("id") int id);
//
//    @Query(value = "SELECT * FROM model WHERE name = :name", nativeQuery = true)
//    public List<Person> nameModel(@Param("name") String name);
//
//    @Transactional
//    @Modifying
//    @Query(value = "INSERT INTO model (name, prise) value (?2, ?1)", nativeQuery = true)
//    public void addUser(int param, String name);
//
//    @Transactional
//    @Modifying
//    @Query(value = "UPDATE model SET name = :name WHERE id = :id", nativeQuery = true)
//    public void updateUseName(@Param("name")String name, @Param("id")int id);
//
//    @Query(value = "SELECT * FROM model WHERE prise BETWEEN ?1 AND ?2 ORDER BY prise DESC", nativeQuery = true)
//    public List<Person> sortPrise(int first, int second);



}
