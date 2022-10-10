package day1005.calculation3;

import day1005.calculationRandom2.NumberCreator;

public class Calculator3 {
    NumberCreator numberCreator; // 인터페이스를 구현받는 클래스말고 인터페이스로 하는 이유는 구현받는 클래스 모두를 쓰려고 다 포함하는 걸로 써놓은거야
    private int baseNum;

    public Calculator3(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum = 10; // 메인클래스에서 baseNum 지정안했을때 10으로 초기화
    }
    public Calculator3(NumberCreator numberCreator, int baseNum) { // numberCreator 객체를 인자로 받은건가?
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }
    public void plus(int num) { // num 인자로 받은게 이 메소드에서만 쓰려고 받은거야?
        System.out.println(num + numberCreator.create(baseNum)); // numberCreator 인터페이스의 메소드에 Calculator3의 변수를 받은건가?
    } //그냥 num + baseNum 해도 똑같은데 왜 굳이 저렇게 해놓은거지 => 변할 가능성이 있는 값들이라 인터페이스에 의존해놓고 메인클래스에서 로직들만 갈아 끼우는듯
}
