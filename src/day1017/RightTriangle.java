package day1017;

import java.util.Scanner;

public class RightTriangle {
    int num;
    public RightTriangle(int num) {
        this.num = num;
    }

    public void getRightTriangle() {

        for (int i = 0 ; i <= num ; i++) {
            for (int j = 0 ; j<i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        RightTriangle rightTriangle = new RightTriangle(num);
        rightTriangle.getRightTriangle();

    }
}
