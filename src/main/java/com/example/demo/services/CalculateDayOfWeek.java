package com.example.demo.services;

public class CalculateDayOfWeek {
    public int computerAndReturnDayOfWeek(int q, int m, int k, int j) {

        int h = (q + (13 + (m + 1) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7;

        int d = ((h + 5) % 7) + 1;

        return d;
    }
}