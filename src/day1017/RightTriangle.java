package day1017;

import java.util.Scanner;

public class RightTriangle {
    private String star = "*";

    public RightTriangle() {
    }

    public RightTriangle(String star) {
        this.star = star;
    }

    public void getRightTriangle(int num) {

        for (int i = 0 ; i <= num ; i++) {
            for (int j = 0 ; j<i ; j++) {
                System.out.print(star);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        RightTriangle rightTriangle = new RightTriangle("#");
        rightTriangle.getRightTriangle(num);

    }
}
