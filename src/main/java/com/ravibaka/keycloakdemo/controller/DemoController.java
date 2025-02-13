package com.ravibaka.keycloakdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ravi Baka
 * Controller class to expose APIs
 */
@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello-1")
    public String hello1() {
        return "Anybody can access this API";
    }

    @GetMapping("/hello-2")
    public String hello2() {
        return "Only Admin can access this API";
    }

    @GetMapping("/hello-3")
    public String hello3() {
        return "Only User can access this API";
    }

    @GetMapping("/hello-4")
    public String hello4() {
        return "Admin/User can access this API";
    }
}
