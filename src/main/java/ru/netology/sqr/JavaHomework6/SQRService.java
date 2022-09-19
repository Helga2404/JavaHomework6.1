package ru.netology.sqr.JavaHomework6.1.services;

public class SQRService {

    public int sqrNum(int rangeLow, int rangeHigh) {

        int sqrNum = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i < rangeLow) {
                continue;
            }
            if (i * i > rangeHigh) {
                break;
            }
            sqrNum++;

        }
        return sqrNum;
    }

}