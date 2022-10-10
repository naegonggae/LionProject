package day1005.calculationRandom2;

public class RandomNumberCreator implements NumberCreator {
    @Override
    public int create(int num) {

        return (int) (Math.random()*9);
    }
}
