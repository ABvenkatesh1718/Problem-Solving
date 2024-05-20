/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DP;

import java.util.Arrays;

/**
 *
 * @author venkatesh
 */
public class MaxSum {

    static int sum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int two = sum(n / 2);
        int three = sum(n / 3);
        int four = sum(n / 4);
        return Math.max((two + three + four), n);
    }

    static int maxSum(int n) {
        // base conditions
        if (n == 0 || n == 1) {
            return n;
        }

        // recursively break the number and return
        // what maximum you can get
        return Math.max(
                (maxSum(n / 2) + maxSum(n / 3) + maxSum(n / 4)),
                n);
    }

    public static void main(String[] args) {
       // System.out.println(sum(12));

        int[] arr1 = {1, 2, 3, 7, 5};
        int[] arr2 = {2, 4, 5, 6};

         System.out.println(Arrays.binarySearch(arr1, 4));
    }
}


