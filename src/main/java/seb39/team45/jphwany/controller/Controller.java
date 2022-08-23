package seb39.team45.jphwany.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld(){
        return "To do Application";
    }
}
