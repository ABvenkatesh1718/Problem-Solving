/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
public class BinarySearch {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // int mid = left + (right - left) / 2;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return left;

    }

    public static void plusOne(int[] digits) {

        StringBuilder result = new StringBuilder();

        for (int i : digits) {
            result.append(i);
        }

         String s= result.toString();
         System.out.println(s);

    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 7, 9};
//        int target=6;
//        
//        System.out.println(searchInsert(a,target ));
        plusOne(a);

    }

}
