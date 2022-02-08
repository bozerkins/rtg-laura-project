package com.demopackage;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        System.out.println(a); // print 0
        a = 5;
        System.out.println(a); // print 5

        int counter = 0;

        System.out.println("Counting up");
        counter = counter + 1;
        System.out.println(counter);
        counter = counter + 1;
        System.out.println(counter);
        counter += 1;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        ++counter;
        System.out.println(counter);

        System.out.println("Counting down");
        counter = counter - 1;
        System.out.println(counter);
        counter -= 1;
        System.out.println(counter);
        counter--;
        System.out.println(counter);
        --counter;
        System.out.println(counter);

    }

}
