/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author venkatesh
 */
public class upperBound {
    
    public static int upperbound(int a[],int key){
        int low=0;
        int high=a.length-1;
        int pos=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid] == key){
                pos=mid;
                low=mid+1;
            }else if(a[mid] < key){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        int a[]={1,3,3,7,7,9};
        System.out.println(upperbound(a,7));
    }
    
}
