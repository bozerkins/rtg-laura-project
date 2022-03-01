package com.demopackage;

public class LoopsExample {

    public static void main(String[] args) {

        // 0 - 8
        int[] myArray = {10, 20, 55, 23};
        int length = myArray.length;

        for(int i = 0; i < length; i++) {
            System.out.println(
                "Index: " + i + "; Value: " + myArray[i] + ";"
            );
        }

    }
}
