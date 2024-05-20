/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author venkatesh
 */
//given arr[] and n
//we have to return the min  no of elements required to get the max sum();
public class MaximumSumInMinimumNumbers {

    int sum(Integer[] a, int n) {
        int sum = 0;
        for (Integer x : a) {
            sum += x;
        }
        Arrays.sort(a, Collections.reverseOrder());
        //   System.out.println(Arrays.toString(a));
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];
            sum -= a[i];
            if (result > sum) //return i+1;
            {
                 return i+1;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Integer[] a = {1,2,99,100};//100 99 2 1 =>202,102,
      //  int n = 5;                
        System.out.println(new MaximumSumInMinimumNumbers().sum(a, a.length));

    }

}


// int a[]
 // Alternatively, you can use Collections.reverse for Integer[] arrays
        // Collections.reverse(Arrays.asList(a));


