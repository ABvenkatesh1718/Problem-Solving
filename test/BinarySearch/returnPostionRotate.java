/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author venkatesh
 */
public class returnPostionRotate {

    private static int findPivot(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        // At this point, low and high will converge to the pivot index
        return low;  // return the pivot index
    }
    public static void main(String[] args) {
        int arr[]={7,7,9,1,3,3};
        System.out.println(findPivot(arr));
    }

}
