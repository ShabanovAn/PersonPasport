package com.pasport.java.config;

import com.pasport.java.entity.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MainConfiguration {
    @Bean(name = "Qualifier")
    public  Person getPerson() {
        Person person = new Person();
        person.setFname("Primary");
        return person;
    }
        @Bean
        @Primary
        public Person getPerson1() {
            Person person = new Person();
            person.setFname("Secondery");
            return person;
        }
}
