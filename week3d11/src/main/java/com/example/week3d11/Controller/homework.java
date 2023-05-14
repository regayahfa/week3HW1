package com.example.week3d11.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wellcome")
public class homework {

    @GetMapping(path = "/get")
    public String helloword(){
        return "Hello";
    }
    @GetMapping(path = "/name")
public String getname(){
        return "my name is :regayah";
}
@GetMapping(path = "/age")
public int getAge(){
        return 23;
}
@GetMapping(path = "/check")
public String check(){
        return "Everything OK";
}
@GetMapping(path = "/health")
public String health(){
        return "Server health is up and running";
}

}
