package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{id}")
    public void test(@PathVariable Long id) {
        if (id.equals(1L)) {
            throw new ExceptionOne();
        } else if (id.equals(2L)) {
            throw new ExceptionTwo();
        }
    }
}
