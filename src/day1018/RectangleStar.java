package day1018;

public class RectangleStar {
    public void printRectangle(int x, int y) {
        for (int i = 0 ; i < x ; i++) {
            for (int j = 0 ; j < y ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RectangleStar rectangleStar = new RectangleStar();
        rectangleStar.printRectangle(3, 10);
    }
}
