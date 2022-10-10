package day1005.calculation3;

import day1005.calculationRandom2.NumberCreator;

public class Calculator3Main {
    public static void main(String[] args) { //인자로 new 할수 있네? ByPassNumberCreator 안쓰다가 굳이 이걸 new 한 이유가 뭐지
        Calculator3 calculator3 = new Calculator3(new ByPassNumberCreator(), 20); // 생성자가 두개이니까 baseNum을 안싸도 오류가 안나
        /*
        NumberCreator numberCreator = new NumberCreator() {
            @Override
            public int create(int num) {
                return 0;
            }
        }
        */

        calculator3.plus(20); // 여기서 numberCreator.create()를 바로 쓸수는 없나?
    }
}
