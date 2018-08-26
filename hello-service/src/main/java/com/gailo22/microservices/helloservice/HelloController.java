package com.gailo22.microservices.helloservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello/{name}")
    public HelloObject hello(@PathVariable String name) {
        return new HelloObject(name);
    }
}

class HelloObject {
    private String name;

    HelloObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
