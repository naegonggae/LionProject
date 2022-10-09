package day1005.calculation;

import day1005.calculation.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5);
        int result = calculator.add(10, 5);
        System.out.println(result);
        calculator.minus(10, 5);
        calculator.multiple(10);
        calculator.divide(10, 3);

    }


}
