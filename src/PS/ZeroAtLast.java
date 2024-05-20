/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
public class ZeroAtLast {

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    public static void reverse(int a[], int start, int end) {
        while(start<=end){
            swap(a[start],a[end]);
            start++;
            end--;
        }
         
       
    }
    public static void zero(int a[],int n,int d){
        
        
        
    }
    
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        
    }

}
