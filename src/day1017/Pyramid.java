package day1017;

public class Pyramid {
    public void printPyramid(int num) {

        for (int i = 0 ; i < num ; i++) {
            for (int k = num ; k > i ; k--) { //int k = num ; k > i ; k--
                System.out.print(" ");
            }
            for (int j = 0 ; j < i*2+1 ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.printPyramid(4);

    }
}
