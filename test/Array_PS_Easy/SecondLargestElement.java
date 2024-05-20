/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

import java.util.Arrays;

/**
 *
 * @author venkatesh
 */
public class SecondLargestElement {

    public static int sle(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static int sle1(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {

                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {

                secondMax = num;
            }
        }
        return secondMax;
    }

    public static int secondElement(int a[], int n) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < min1) {
                min2 = min1;   
                min1 = a[i];   
            } else if (a[i] < min2 && a[i] != min1) {
                min2 = a[i];
            }
        }
        return min2;

    }
    public static int[] findSecondLargestAndSmallest(int n, int[] a) {
        if (n < 2) {
            // Handle the case where the array has less than two elements
            // You may want to throw an exception or return an appropriate value
            return new int[]{-1, -1}; // Adjust this as needed
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondSmallest && a[i] != smallest) {
                secondSmallest = a[i];
            }

            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            // Handle the case where there is no second smallest element
            // You may want to throw an exception or return an appropriate value
            return new int[]{-1, -1}; // Adjust this as needed
        }

        return new int[]{secondLargest, secondSmallest};
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(secondElement(a, 7));
    }
}
