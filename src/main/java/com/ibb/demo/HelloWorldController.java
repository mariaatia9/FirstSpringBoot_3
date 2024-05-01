/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.demo;

import com.ibb.model.Address;
import com.ibb.model.Person;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author trainer
 */
@RestController
@Scope(scopeName = "session")
public class HelloWorldController {
    private List<Person> personenListe;
    
    
   @Autowired 
   private MyService myService;

    public HelloWorldController() {
        personenListe=new ArrayList<>();
        System.out.println("Mein Restcontroller wurde instantiiert!");
    }

    public HelloWorldController(MyService myService) {
        this();
        this.myService = myService;
    }

    public List<Person> getPersonenListe() {
        if(personenListe.isEmpty()){
            personenListe=myService.serviceListe();
        }
        return personenListe;
    }

    public void setPersonenListe(List<Person> personenListe) {
        this.personenListe = personenListe;
    }
    
   
    
    
    @GetMapping(path = "greeting")
    public String doSomething(){
        return "<h2>Hallo Spring Boot World</h2>";
    }
    
    
    
    
     @GetMapping(path = "greet")
    public String doSomething1(){
        return "Hallo Spring Boot World 2";
    }
    
    @GetMapping(path="person")
    public Person takePerson(){
        Person p=new Person("Hans","Musterman");
        
        return p;
    }
    
    @GetMapping(path="liste")
    public List<Person> listPerson(){
        
        return getPersonenListe();
    }
    
}
