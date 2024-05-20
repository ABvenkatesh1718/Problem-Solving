/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author venkatesh
 */
public class countTheElement {
    public static void main(String[] args) {
        int a[]={1,3,3,7,7,9};
        int lb=lowerBound.lowerbound(a, 3);
        int ub=upperBound.upperbound(a, 3);
        System.out.println("occurance is :: "+(ub-lb+1));
    }
    
}
