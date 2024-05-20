/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

import java.util.Arrays;



/**
 *
 * @author venkatesh
 */
public class Largest_Element {
    //0(n)
    public static int largest(int a[]){
        int max=0;int smax=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max){
                max=a[i];
               
            }
        }
        return smax;
    }
    public static int largest1(int a[]){
        Arrays.sort(a);
        return a[a.length-1];
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,9};
        System.out.println(largest1(a));
    }
        
    
}
