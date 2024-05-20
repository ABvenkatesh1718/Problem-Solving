/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
 
import java.util.*;

public class Sum_Of_pairs {

    public static void findPairsWithSum(int[] nums, int targetSum) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                System.out.println(num + " " + complement);
               // System.exit(0);
            }
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 7, 5, 8};
        int target = 10;
        char s='a';
        System.out.println((int)s);

       // findPairsWithSum(nums, target);
    }
}
