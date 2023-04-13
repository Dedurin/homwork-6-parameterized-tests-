package ru.netology.sqr;

public class SquareRoot {
    public int calcSQRT(int minRange, int maxRange) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minRange)
                if (i * i <= maxRange) {
                    count++;
                }
        }
        return count;
    }
}

