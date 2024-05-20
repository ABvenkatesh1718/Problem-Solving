/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

import java.util.ArrayList;

/**
 *
 * @author venkatesh
 */
//reversing an elements with certain k value 
public class ReverseElementsWithGroup {
    
    public static void rawp(ArrayList<Integer>a,int n,int k)
    {
      //  reverse(i,a,n,k);
        for(int i=0;i<n;i+=k)
        {
            reverse(i,a,n,k);
        }
    }
    public static void reverse(int i,ArrayList<Integer>a,int n,int k)
    {
        int l=i;
        int r=Math.min(n-1,i+k-1);
        while(l<r)
        {
            int temp=a.get(l);
           // a.set(1,a.get(r));
            a.set(l, a.get(r));
            a.set(r,temp);
            l++;
            r--;
        }
            
    }
    public static void main(String[] args)
    {
        ArrayList a=new ArrayList<Integer>();
        for(int i=0;i<5;i++)
        {
            a.add(i+1);
        }
       rawp(a,5,4);
        System.out.println(a);
            
       
    }
    
            
    
}
