package com.demopackage;

public class BinarySearch {
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
        int n = myArray.length;
        int value = 42;

        int low, high, mid;

        low = 0; // first index - 0
        high = n - 1; // last index - 9
        mid = low + (high - low) / 2;
        System.out.println("Starting mid " + mid);
        // 0 + (9 - 0) / 2 = 4

        // found marker
        boolean foundElement = false;

        // start search
        while(low <= high) {
            if (myArray[mid] > value) {
                // mid value is greater than search value
                high = mid - 1;
                mid = low + (high - low) / 2;
                System.out.println("mid greater than value, going left. mid: " + mid);
            } else if (myArray[mid] < value) {
                // search value is greater than mid value
                low = mid + 1;
                mid = low + (high - low) / 2;
                System.out.println("mid greater than value, going right. mid: " + mid);
            } else {
                // equals myArray[mid] == value
                System.out.println("Found the value at index " + mid);
                foundElement = true;
                break;
            }
        }

        // display result
        if (foundElement) {
            System.out.println("Element is found at index: " + mid);
        } else {
            System.out.println("Element is not found!");
        }
    }
}
