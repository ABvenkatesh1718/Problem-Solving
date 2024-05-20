/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author venkatesh
 */
public class SearchTheElement {
    
    public static int search(int a[],int key){
        
        int low=0;
        int high=a.length-1;
        int mid=0;
        while(low<=high){
             mid=low+(high-low)/2;
            if(a[mid] == key){
                return (mid+1);
            }
            else if(a[mid]<key){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (mid+1);
    }
    public static void main(String[] args) {
        int a[]={1,3,4,5,6,7,10};
        //System.out.println(search(a,8));
         
       ArrayList<Integer> ab=new ArrayList<>();
       ab.add(10);ab.add(20);ab.add(30);ab.add(40);
        System.out.println(ab);
        Collections.reverse(ab);
        
        System.out.println(ab);
       
    }
    
}
