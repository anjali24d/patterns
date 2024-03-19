package com.basic;

public class PatternQ1 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
