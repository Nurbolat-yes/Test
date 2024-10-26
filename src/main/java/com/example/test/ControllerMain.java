package com.example.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("Nurbolat-yes")
@CrossOrigin
public class ControllerMain {
    private Person person;
    @GetMapping("/first")
    public Person response(){
        return new Person("Nurbolat",18);
    }
}
