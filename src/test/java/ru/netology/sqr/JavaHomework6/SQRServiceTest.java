package ru.netology.sqr.JavaHomework6.1.services;
import org.junit.jupiter.api.Assertions;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test


    public void test(){

        SQRService service = new SQRService();

        int rangeLow = 200;
        int rangeHigh = 300;
        int expected = 3;
        int actual = service.sqrNum(rangeLow, rangeHigh);

    }
}
