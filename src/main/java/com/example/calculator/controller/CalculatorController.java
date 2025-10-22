package com.example.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.Service.CalculatorService;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/sum")
    public String sum(@RequestParam("a") Integer a,
                      @RequestParam("b") Integer b) {
        return String.valueOf(calculatorService.sum(a, b));
    }
}