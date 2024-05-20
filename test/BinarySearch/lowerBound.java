/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author venkatesh
 */
public class lowerBound {
    public static int  lowerbound(int a[],int key){
        
        int low=0;
        int high=a.length-1;
        int pos=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid] == key){
                
                pos=mid;
                high=mid-1;
            }else if(a[mid]<key){
                low=mid+1;
            }else{
                
                high=mid-1;
            }
        }
        return pos;    
    }
    public static void main(String[] args) {
        int a[]={-5,-3,-3,2,2,3};
        System.out.println(lowerbound(a,-3));
    }
    
}
