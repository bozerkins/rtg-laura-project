package com.demopackage;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the operation (+,-,*,/,pow,sqrt)");
        String operation = scanner.next();

        System.out.println("Please enter number 1: ");
        int number1 = scanner.nextInt();

        int number2 = 0;
        // not pow operation
        if (!operation.equals("pow")) {
            // read second number for common operations
            // +, -, *, /
            System.out.println("Please enter number 2: ");
            number2 = scanner.nextInt();
        }

        System.out.println("Your operation is: " + operation);
        if (!operation.equals("pow")) {
            // write expression for common cases
            // +, -, *, /
            System.out.println("Expression: " +
                    number1 + " " + operation + " " + number2
            );
        } else {
            // write expression for single-number cases
            System.out.println("Expression: " +
                    operation + "(" + number1 + ")"
            );
        }

        if (operation.equals("+")) {
            int result = number1 + number2;
            System.out.println("Result is: " + result);
        } else if (operation.equals("-")) {
            int result = number1 - number2;
            System.out.println("Result is: " + result);
        } else if (operation.equals("pow")) {
            double result = Math.pow(number1, 2);
            System.out.println("Result is: " + result);
        } else {
            System.out.println("Invalid operation: " + operation);
        }
    }
}
