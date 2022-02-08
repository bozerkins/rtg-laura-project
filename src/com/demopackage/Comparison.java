package com.demopackage;

public class Comparison {

    public static void main(String[] args) {

        boolean isTest = true;
        System.out.println("isTest= " + isTest);

        int myHeight = 189;
        if (myHeight > 170) {
            System.out.println("We're higher than 170");
        } else {
            System.out.println("We're shorter than 170");
        }

        System.out.println("189 > 170  " + (189 > 170));
        System.out.println("189 < 170  " + (189 < 170));
        System.out.println("189 >= 170  " + (189 >= 170));
        System.out.println("189 <= 170  " + (189 <= 170));
        System.out.println("189 == 170  " + (189 == 170)); // is equal
        System.out.println("189 != 170  " + (189 != 170)); // not equal

        int temperatureOutside = 20;
        boolean isRaining = true;

        if (temperatureOutside > 25 && isRaining == false) {
            System.out.println("Weather is good");
        } else {
            System.out.println("Weather is bad");
        }
    }

}
