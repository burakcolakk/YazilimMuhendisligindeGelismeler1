package com.calculator.Calculator.service;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/collect")
    public int collect(@RequestParam int val1,@RequestParam int val2){

        return val1+val2;

    }

    @PostMapping("/multiply")
    public int multiply(@RequestParam int val1,@RequestParam int val2){
        return val1+val2;
    }
}
