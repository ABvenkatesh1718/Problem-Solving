/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hashing_technique;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author venkatesh
 */
public class map {

    public static double median(int[] a, int[] b) {

        int i = a.length - 1;
        int j = 0;

        while (i >= 0 && j < b.length) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if ((a.length + b.length) % 2 == 0) {
            return (double) (a[a.length - 1] + b[0]) / (2);
        } else {
            if (a.length > b.length) {
                return a[a.length - 1];

            } else {
                return b[0];
            }
        }

    }

    public static double median1(int a[], int b[]) {
        int n = a.length + b.length;
        int pos = n / 2;
        int i = 0;
        int j = 0;
        int idx = -1;
        int cur = -1;
        int prev = cur;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                idx++;
                cur = a[i];
                prev = cur;

                if (idx == pos) {
                    System.out.println(prev + " " + cur);
                    return (double) (prev + cur) / 2;
                }

            } else {
                idx++;
                cur = b[j];
                prev = cur;
                if (idx == pos) {

                    System.out.println(prev + " " + cur);
                    return (double) (prev + cur) / 2;
                }

            }
        }
        return -1;

    }

    public static int[] merge(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int k = 0;
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        if (i < a.length) {
            while (i < a.length) {
                c[k++] = a[i++];
            }
        } else {
            while (j < b.length) {
                c[k++] = b[j++];
            }

        }

        return c;

    }

    public static List<String> reverseStrings(String[] s) {
        return Arrays.stream(s)
                .map(n -> new StringBuilder(n).reverse().toString())
                .collect(Collectors.toList());
    }

    public static int firstMissing(int[] arr, int n) {
        Arrays.sort(arr);
        int ans = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ans) {
                ans++;
            }
        }
        return ans;
    }

    public static double findMedianSortedArrays(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        //if n1 is bigger swap the arrays:
        if (n1 > n2) return median(b, a);

        int n = n1 + n2; //total length
        int left = (n1 + n2 + 1) / 2; //length of left half
        //apply binary search:
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            //calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0; //dummy statement
    }

    public static void main(String[] args) {
        int a[] = {};
        int b[] = {3, 4};
        System.out.println(findMedianSortedArrays(a, b));

    }

}
