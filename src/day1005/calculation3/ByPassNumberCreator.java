package day1005.calculation3;

import day1005.calculationRandom2.NumberCreator;

public class ByPassNumberCreator implements NumberCreator {
    @Override
    public int create(int num) { // 인자를 안넣으면 오류나
        return num+100;
    }
}
