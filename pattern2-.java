package com.creator;

public class pattern2 {
    public static void main(string args[]) {
        for (int r = 5; r >= 1; r--) {
            for (int s = 1; s <= (s - r); s++) {
                system.out.print();
            }
            for (int c = 1; c <= r; c++) {
                system.out.print("*");
            }
            system.out.println();
        }
    }
}
