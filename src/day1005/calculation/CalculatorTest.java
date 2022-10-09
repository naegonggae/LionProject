package day1005.calculation;

import day1005.calculation.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5);
        int result = calculator.add();
        System.out.println(result);
        calculator.minus();
        calculator.multiple();
        calculator.divide(0);

    }


}
