package com.thymeleaf.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping(value = "/product")
    public String getProduct() {
        System.out.println("getProduct");
        return "product";
    }
}
