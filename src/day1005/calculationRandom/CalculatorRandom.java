package day1005.calculationRandom;

public class CalculatorRandom {
    private int firstNum;
    private int randomTo;

    public CalculatorRandom( int firstNum, int randomTo){
        this.firstNum = firstNum;
        this.randomTo = randomTo;
    }

    public int getRandomInt() {
        int randomInt = (int) (Math.random() * (this.randomTo + 1));
        System.out.printf("생성된 랜덤 숫자:%d\n", randomInt);
        return randomInt;
    }
    public void plus() {
        System.out.println(firstNum + getRandomInt());
    }
    public void minus() {
        System.out.println(firstNum - getRandomInt());
    }
    public void multiple() {
        System.out.println(firstNum * getRandomInt());
    }
    public void divide() {
        int randomInt = getRandomInt();
        if (randomInt == 0){ // 위에 처럼 안묶으면 조건문 검사하다 getRandomInt 한번더 실행됨
            System.out.println("랜덤생성한 숫자가 0입니다.");
        }else{
            float result = (float) firstNum / randomInt;
            System.out.println(":"+result);
        }
    }

}
