/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
//        int a[] = {1, 2, 4};
//        int b[] = {1, 3, 4};
//        for (int x : merge(a, b)) {
//            System.out.println(x);
//        }
public class MergingOfTwoSortedArrays {

    public static int[] merge(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        int m = a.length;
        int n = b.length;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        for (; i < m; i++) {
            c[k++] = a[i];
        }
        for (; j < n; j++) {
            c[k++] = b[j];
        }

        return c;

    }

    public void reverse() {
        int n = -123;
        String s = "";

        int flag = 0;
        if (n > 0) {
            flag = 1;
            while (n > 0) {
                s = s + String.valueOf(n % 10);
                n = n / 10;
            }
        } else {
            int num = Math.abs(n);
            while (num > 0) {
                s = s + String.valueOf(num % 10);
                num = num / 10;
            }
        }
        if (flag == 1) {
            System.out.println("revere is :  " + s);
        } else {
            System.out.println("reverse is : " + "-" + s);
        }
    }

    public static int reverseint(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static int reverseOur(int x) {
        int rev = 0, rem = 0;
        int flag = x > 0 ? 1 : 0;
        int num = Math.abs(x);
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (flag == 1) {
            return rev;
        } else {
            return (-1) * rev;
        }
    }

    public static void ispalindrome(int x) {

    }

    public static int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long quo = 0;
//        if(Math.abs(dividend) < Math.abs(divisor)){
//            return 0;
//        }
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        quo = Math.abs(dividend) / Math.abs(divisor);
        if (quo > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (quo < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (sign == -1) {
            return (-1) * (int) quo;
        } else {
            return (int) quo;
        }

    }

    public static int[] mergesor(int a[], int b[]) {
        int m = a.length, n = b.length;
        int c[] = new int[m + n];
        int i, j, k = 0;
        for (i = 0, j = 0; i < m && j < n;) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        for (; i < m; i++) {
            c[k++] = a[i];
        }
        for (; j < n; j++) {
            c[k++] = b[j];
        }
        return c;
    }

    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int c[];
        c = merge(nums1, nums2);
        int len = c.length;
        if (len % 2 == 0) {
            float f = (c[(len / 2) + c[(len / 2) - 1]]) / (2.0f);
            System.out.println(f);
        } else {
            float f = c[len / 2];
            System.out.println(f);
        }
    }

    public static void printAllSubstrings(String str) {
        int n = str.length();

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                String substring = str.substring(start, end + 1);
//                if (isPalindrome(substring)) {
//                    System.out.println(substring);
//                }
                System.out.println(substring);
            }
        }
    }

    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
//        int a[]={1,3};
//        int b[]={2};
//        findMedianSortedArrays(a,b);
//         
        printAllSubstrings("abcde");

    }

}
