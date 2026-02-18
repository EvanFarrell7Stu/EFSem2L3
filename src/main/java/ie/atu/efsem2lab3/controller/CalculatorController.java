package ie.atu.efsem2lab3.controller;

import ie.atu.efsem2lab3.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
    public final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b){
    int rslt = a+b;
        return rslt;
    }
}
