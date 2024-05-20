/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author venkatesh
 */
public class singleElementOccur {
    public static void main(String[] args) {
        int a[]={1,3,3,7,7,9};
        int lb=lowerBound.lowerbound(a, 9);
        int ub=upperBound.upperbound(a, 9);
        int occur=0;
        if(a[lb] == a[ub]){
            occur=ub-lb+1;
        }
        System.out.println(occur);
        
    }
    
}
