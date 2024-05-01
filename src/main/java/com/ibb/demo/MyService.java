/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.demo;

import com.github.javafaker.Faker;
import com.ibb.model.Address;
import com.ibb.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 *
 * @author trainer
 */
@Service
public class MyService {

    

    public MyService() {
       
        System.out.println("Service initialisiert!");
    }

    public List<Person> serviceListe() {
       List<Person> personenListe = new ArrayList<>();
        
            Faker f = new Faker(new Locale("de"));
            for (int i = 0; i < 8; i++) {
                Person p = new Person(f.address().firstName(), f.address().lastName());
                Address a = new Address(f.address().cityName(), f.address().streetName());
                p.setAddress(a);
                personenListe.add(p);
            }
        
       
        return personenListe;
    }

}
