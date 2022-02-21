package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String textOutput() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path="/plus")
    public String summable(@RequestParam("num1") int num1, @RequestParam ("num2") int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.summable(num1,num2);
    }

    @GetMapping(path="/minus")
    public String subtract(@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.subtract(num1,num2);
    }

    @GetMapping(path="/multiply")
    public String increase(@RequestParam (name="num1", required=false) Integer num1, @RequestParam (name="num2", required=false) Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorService.increase(num1,num2);
    }

    @GetMapping(path="/divided")
    public String split(@RequestParam (name="num1", required=false) Integer num1, @RequestParam (name="num2", required=false) Integer num2) {
        return num1 + " / " + num2 + " = " + calculatorService.split(num1,num2);
    }
}
