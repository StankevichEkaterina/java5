package ru.netology.sqr;

public class SQRService {
    public int squareNumbersInRange(int from, int before) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= from && i * i <= before) {
                counter++;
            }
        }
        return counter;
    }
}





