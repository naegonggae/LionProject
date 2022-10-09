package day1005.calculation;

public class Calculator {
    private int a;
    private int b;

    Calculator(int b) {
        this.b = b;
    }
    public int add(int a, int b) {
        return a+b;
    }
    public void minus(int a, int b) {
        System.out.println(a-b);
    }
    public void multiple(int a) {
        System.out.println(a*b);
    }
    public void divide(int a, int b) {
        if ( b <= 0) {
            System.out.println("0으로 나눴습니다.");
        } else {System.out.println((float) a/b);}

    }
}
