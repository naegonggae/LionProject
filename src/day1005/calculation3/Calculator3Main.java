package day1005.calculation3;

import day1005.calculationRandom2.NumberCreator;
import day1005.calculationRandom2.RandomNumberCreator;
import day1005.calculationRandom2.SpecificNumberCreator;

public class Calculator3Main {
    public static void main(String[] args) { //인자로 new 할수 있네? ByPassNumberCreator 안쓰다가 굳이 이걸 new 한 이유가 뭐지
        // 방법 1 NumberCreator 에 있는 RandomNumberCreator 을 인자로 받은 Calculator3 객체인 randomNumberCreator
        NumberCreator numberCreator = new RandomNumberCreator();
        Calculator3 randomNumberCreator = new Calculator3(numberCreator);
        randomNumberCreator.plus(20);

        // 방법 2 NumberCreator 에 있는 ByPassNumberCreator 을 인자로 받은 Calculator3 객체인 calculator3
        Calculator3 calculator3 = new Calculator3(new ByPassNumberCreator(), 20); // 생성자가 두개이니까 baseNum을 안싸도 오류가 안나
        calculator3.plus(20); // 여기서 numberCreator.create()를 바로 쓸수는 없나?

        //방법 3
        Calculator3 specificNumberCreator = new Calculator3(new SpecificNumberCreator());
        specificNumberCreator.plus(20);
    }
}
