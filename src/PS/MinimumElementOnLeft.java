/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
 
import java.util.ArrayList;
import java.util.Stack;

/**
 * This class computes the minimum element on the left for each element in an array.
 */
public class MinimumElementOnLeft {

    /**
     * Finds the minimum element on the left for each element in the array.
     *
     * @param a The input array.
     * @param n The length of the input array.
     * @return An ArrayList containing the minimum elements on the left side for each element.
     */
    
    /**
     * Default constructor for MinimumElementOnLeft class .
    */
    public MinimumElementOnLeft() {
        // Default constructor
    }
    public static ArrayList<Integer> fun(int[] a, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= a[i]) {
                stack.pop(); // Remove elements greater than or equal to current element
            }
            
            if (stack.isEmpty()) {
                list.add(-1); // If stack is empty, no smaller element on the left
            } else {
                list.add(stack.peek()); // Smaller element on the left
            }
            
            stack.push(a[i]); // Push current element to the stack
        }
        
        return list;
    }

    /**
     * Main method to demonstrate the functionality.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        int a[] = {7, 3, 4, 8, 5};
        int n = a.length;
        System.out.println(fun(a, n));
    }
}

