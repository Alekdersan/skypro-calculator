package pro.sky.skyprocalculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyprocalculator.ZeroDivisionException;
import pro.sky.skyprocalculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String textOutput() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int summable(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int increase(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int split(int num1, int num2) {
            if (num2 == 0) {
            throw new ZeroDivisionException();
        }
        return num1/num2;
    }
}
