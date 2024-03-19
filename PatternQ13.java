package com.basic;

public class PatternQ13 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 0; row < n ; row++) {
            for (int col = 0; col < 2*n-1 ; col++) {
                if(row<n-1){
                    if(col==n-row-1 || col==n+row-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
