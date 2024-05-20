/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

/**
 *
 * @author venkatesh
 */
public class Majority_halfSize {

    public static int majorityOccurrence(int[] nums) {
        int n = nums.length;
        int candidate = nums[0];
        int count = 1;
        
        // Find the majority candidate
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        // Check if the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        
        return count > n / 2 ? candidate : -1; // Return -1 if no majority element found
    }

    public static void main(String[] args) {
        int a[] = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        System.out.println( majorityOccurrence(a));
    }
}
