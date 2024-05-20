/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author venkatesh
 */
public class firstAndLastOccurance {
    
    public static void main(String[] args) {
        int a[]={1,3,3,7,7,9};
        
        int lastoccur=upperBound.upperbound(a, 3);
        
        int firoccur=lowerBound.lowerbound(a, 3);
        
        System.out.println("first occurance is: "+ firoccur);
        
        System.out.println("last occurance is  : " + lastoccur);
    }
    
}
