package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class DemoController {
  
  @GetMapping
  public String index(Model model) {
    model.addAttribute("pageTitle", "Hello spring"); 
    model.addAttribute("langs", List.of("Java", "Kotlin", "Groovy")); 
  
    return "index";
  }
  
}
