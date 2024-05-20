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
public class BinarySearch2DArray {

    public static int binarySearch(int a[], int target) {
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                return mid+1;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return low+1;
    }
    public static int [] binarySearch2d(int a[][],int target){
        int n=a.length;
        int row=a.length;
        if(row == 0){
            System.exit(0);
        }
        int col=a[0].length;
        int low=0;
        int high=row*col-1;
         
        while(low <= high){
            int  mid =(low + high)/2;
            int mid_element=a[mid/col][mid % col];
            if(mid_element == target ){
               // return true;
                return new int []{mid/col,mid%col};
            }else if(mid_element < target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return new int []{low/col,low%col};
      //  return false;
    }
    public static void main(String args[]){
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println(Arrays.toString(binarySearch2d(matrix,24)));
        
    }

}
