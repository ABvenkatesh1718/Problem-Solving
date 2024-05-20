/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author venkatesh
 */
public class FrequencyCount {

    public static int first(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int pos = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] >= x) {
                pos = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return arr[mid] == x ? mid : -1;
    }

    public static void pushZerosAtEnd(ArrayList<Integer> arr) {
        int i = 0;
        for (i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                break;
            }
        }

        int j = i + 1;
        while (j < arr.size()) {
            if (arr.get(j) != 0) {
                if (i != j) {
                    Collections.swap(arr, i, j);
                }
                i++;
                j++;
            } else {
                j++;
            }
            arr.forEach(System.out::print);

        }
    }
    
    
    

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        

    }

}
