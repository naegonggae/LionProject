package day1005.calculation;

public class Calculator {
    private int a;
    private int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int plus() {
        return a+b;
    }
    public void minus() {
        System.out.println(a-b);
    }
    public void multiple() {
        System.out.println(a*b);
    }
    public void divide(int b) {
        if ( b <= 0) {
            System.out.println("0으로 나눴습니다.");
        } else {System.out.println((float) a/b);}

    }
}
