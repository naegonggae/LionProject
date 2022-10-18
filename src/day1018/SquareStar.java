package day1018;

public class SquareStar {
    public void printSquare(int num) {
        for (int i = 0 ; i< num ; i++) {
            for (int j = 0 ; j < num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SquareStar squareStar = new SquareStar();
        squareStar.printSquare(5);
    }
}
