package day1005.calculation3;

import day1005.calculationRandom2.NumberCreator;

public class Calculator3 {
    NumberCreator numberCreator;
    private int baseNum;

    public Calculator3(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum = 10; // 메인클래스에서 baseNum 지정안했을때 10으로 초기화
    }
    public Calculator3(NumberCreator numberCreator, int baseNum) { // numberCreator 객체를 인자로 받은건가?
        this.numberCreator = numberCreator; // ByPassNumberCreator numberCreator 이렇게는 또 못받네
        this.baseNum = baseNum;
    }
    public void plus(int num) { // num 인자로 받은게 이 메소드에서만 쓰려고 받은거야?
        System.out.println(num + numberCreator.create(baseNum)); // numberCreator 인터페이스의 메소드에 Calculator3의 변수를 받은건가?
    } //그냥 num + baseNum 해도 똑같은데 왜 굳이 저렇게 해놓은거지
}
