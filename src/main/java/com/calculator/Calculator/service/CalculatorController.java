package com.calculator.Calculator.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/collect")
    public int collect(@RequestParam int val1,@RequestParam int val2){

        return val1+val2;

    }
}
