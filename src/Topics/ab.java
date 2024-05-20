/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topics;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author venkatesh
 */
public class ab {

    public static int search(int[] nums, int target) {
        int length = nums.length;
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int findDuplicate(ArrayList<Integer> arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) { // add() returns false if the element already exists
                return num; // found a duplicate
            }
        }
        return -1; // no duplicates found

    }

    public static void main(String[] args) {
        var ar = new ArrayList<Integer>();
        ar.add(1);ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(4);
        ar.add(4);
        System.out.println(findDuplicate(ar));

    }
}
