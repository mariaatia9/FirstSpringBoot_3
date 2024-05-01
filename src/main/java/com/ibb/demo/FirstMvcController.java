/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.demo;

import com.ibb.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author trainer
 */
@Controller
public class FirstMvcController {
    
     @Autowired 
   private MyService myService;

    public FirstMvcController() {
        System.out.println("Controller erstellt!");
    }
    
    public List<Person> lp(){
        return myService.serviceListe();
    }
    
}
