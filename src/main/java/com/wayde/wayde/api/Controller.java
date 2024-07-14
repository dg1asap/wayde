package com.wayde.wayde.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String get() {
        return "Zaczynamy!";
    }

    @GetMapping("/a")
    public String aget() {
        return "454333333332444AAAAAA!";
    }
}
