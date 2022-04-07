package pro.sky.skyprocalculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyprocalculator.service.CalculatorService;

@Service
public class CalculatorImplService implements CalculatorService {

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
    public String increase(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Не передан параметр для расчета.";
        }
        return String.valueOf(num1 * num2);
    }

    @Override
    public String split(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Не передан параметр для расчета.";
        } else if (num2 == 0) {
            return ("Деление на ноль запрещено");
        }
        return String.valueOf (num1/num2);
    }
}
