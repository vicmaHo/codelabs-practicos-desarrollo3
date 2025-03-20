package co.edu.univalle.hello.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {

    @GetMapping("/hello")
    public String helloString() {
        return "Hello World";
    }
    
}
