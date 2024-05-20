/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;
import java.util.Arrays;

/**
 * 
 * @author venkatesh
 */
//input: given two arrays a,b with same size n
// output: we can arrange element in any  way such that a[i]<b[j] then return true else false

public class FittingArray {
    boolean fit(int a[],int b[],int n)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            if(a[i]>b[i])
            {
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        //System.out.println("hello ");
        int a[]={4,5,6,7};
        int b[]={5,6,7,8};
        
        int n=4;
        System.out.println(new FittingArray().fit(a,b,n));
       
    }
    
}
