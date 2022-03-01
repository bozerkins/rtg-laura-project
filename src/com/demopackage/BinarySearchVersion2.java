package com.demopackage;

public class BinarySearchVersion2 {

    public static void main(String[] args) {

        /**
         * taken from: https://en.wikipedia.org/wiki/Binary_search_algorithm#Procedure
         * function binary_search(A, n, T) is
         *     L := 0
         *     R := n − 1
         *     while L ≤ R do
         *         m := floor((L + R) / 2)
         *         if A[m] < T then
         *             L := m + 1
         *         else if A[m] > T then
         *             R := m − 1
         *         else:
         *             return m
         *     return unsuccessful
         */

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
        int lastIndex = myArray.length - 1;
        int leftIndex = 0;
        int rightIndex = lastIndex - 1;
        int middleIndex = -1; // default -1 === not found
        int searchValue = 31;
        boolean searchValueFound = false;

        while (leftIndex <= rightIndex) {
            middleIndex = (leftIndex + rightIndex) / 2;
            if (myArray[middleIndex] < searchValue) {
                // move right
                leftIndex = middleIndex + 1;
            } else if (myArray[middleIndex] > searchValue) {
                // move left
                rightIndex = middleIndex - 1;
            } else {
                searchValueFound = true;
                break;
            }
        }

        // display result
        if (searchValueFound) {
            System.out.println("Element is found at index: " + middleIndex);
        } else {
            System.out.println("Element is not found!");
        }
    }
}
