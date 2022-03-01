package com.demopackage;

public class PrintArray {

    public static void main(String[] args) {
        int[] myArray = {
                10, // 0
                14, // 1
                19, // 2
                26, // 3
                27, // 4
                31, // 5
                33, // 6
                35, // 7
                42, // 8
                44 // 9
        };

        System.out.print("Your array:");
        for(int i = 0; i < myArray.length; i++) {
            System.out.print(" " + myArray[i]);
        }
        System.out.println();
    }
}
