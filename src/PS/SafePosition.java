/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;
import java.util.*;
/**
 *
 * @author venkatesh
 */
public class SafePosition {
    void rec(int i,int k,ArrayList<Integer>arr)
    {
        if(arr.size()==1)
        {
            return;
        }
        
            i=(i+k-1)%arr.size();
            arr.remove(i);
            rec(i,k,arr);
                  
    }
    
    
    public static void main(String[] args) {
        int n=5,k=2;
        ArrayList<Integer>arr=new ArrayList<>(n);
       for(int i=0;i<n;i++)
       {
           arr.add(i+1);
       }
       SafePosition sp=new SafePosition();
       sp.rec(0,k,arr);
        System.out.println(arr.get(0));
      //  System.out.println(arr.size());
        
    }
    
    
    
}
//GIVEN THE N AND K VALUE 
//I HAVE TO CONSIDER THE SERIAL WISE INTEGER VALUE UP TO N CIRCULAR CLOCKWISE DIRECTION 
// NOW I HAVE TO KILL OR REMOVE THE ELMENT ON EVERY Kth POSITION return the last safe value 
//1234
//3456


