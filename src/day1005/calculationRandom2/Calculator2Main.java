package day1005.calculationRandom2;

public class Calculator2Main {
    public static void main(String[] args) {
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        Calculator2 calculator2 = new Calculator2(10, 9, new SpecificNumberCreator()); // SpecificNumberCreator 이건왜 한거야
        for (int i = 0; i < 100; i++) {
            calculator2.plus();
        }
    }
}
