/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author venkatesh
 */
public class MagicIndex {

    public static int findMagic(int a[]) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == mid) {
                return mid;
            } else if (a[mid] < mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return -1;
    }

     

     

    public static void main(String[] args) {
        int[] arr = {-5, -1,1,3,9};
        System.out.println(findMagic(arr));
         
    }

}

/*
int binarySearch(int arr[], int low, int high) 
{ 
    if (high >= low) { 
        int mid = low + (high - low) / 2; 
        if (mid == arr[mid]) 
            return mid; 
        int res = -1; 
        if (mid + 1 <= arr[high]) 
            res = binarySearch(arr, (mid + 1), high); 
        if (res != -1) 
            return res; 
        if (mid - 1 >= arr[low]) 
            return binarySearch(arr, low, (mid - 1)); 
    } 
  
    /* Return -1 if there is no Fixed Point */
//  return -1; 

