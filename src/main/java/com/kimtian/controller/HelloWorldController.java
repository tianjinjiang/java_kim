package com.kimtian.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Helloworld Controller
 *
 * @author kimtian
 **/
@RestController
public class HelloWorldController {
    @RequestMapping("/ccc")
    public String index() {
        return "Hello World";
    }
}
