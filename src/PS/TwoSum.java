/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author venkatesh
 */
public class TwoSum {

    public static String YesOrNO(int a[], int n, int target) {
        Arrays.sort(a);
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int temp = a[i] + a[j];

            if (temp == target) {
                return "True";
            } else if (temp > target) {
                j--;
            } else if (temp < target) {
                i++;
            }
        }
        return "NO";
    }

    public static void fun(int a[], int n, int target) {
        HashMap<Integer, Integer> hp = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int temp = target - a[i];
            if (hp.containsValue(temp)) {
                System.out.println("true");
                return;
            }

            hp.put(i, a[i]);
        }
        System.out.println("flase");
    }
    public static boolean fun1(int a[], int n, int targetsum) {

        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {

            for (j = i + 1; j < n; j++) {
                if (a[i] + a[j] == targetsum) {
                    return true;
                }
            }

        }
        return false;//0(n square);
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 2, 7, 6};// 1 2 4 6 7//

        boolean sta = fun1(a, 5, 9);

        System.out.println(sta);

    }

}
