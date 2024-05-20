/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author venkatesh
 */
public class Subset {
    public static void subset(int index,int a[],int n,ArrayList<Integer>list){
        if(index==n){
            for(int x : list){
                System.out.print(x+" ");
            }
            if(list.isEmpty()){
                System.out.println("{}");
            }
            System.out.println(" "); 
            return ;
        }
        list.add(a[index]);
        subset(index+1,a,n,list);
        list.remove(list.size()-1);
        subset(index+1,a,n,list);
        
    }
    public static void reversearray(int index,int n,int a[]){
        if(index>=n) return ;
        reversearray(index+1,n,a);
        System.out.println(a[index]);
        
    }
    public static void subsetsum(int index,int a[],int n,ArrayList<Integer>list,int sum){
        if(index==n){
            //int sum1=list.stream().mapToInt(Integer::intvalue).sum()
            int sum1=0;
            for(int x : list){
                sum1+=x;
            }
            if(list.isEmpty()){
                 
            }
            System.out.println(" "); 
            return ;
        }
        list.add(a[index]);
        subset(index+1,a,n,list);
        list.remove(list.size()-1);
        subset(index+1,a,n,list);
        
    }
    
    
    public static void main(String[] args) {
        int a[]={3,1,2};
        //reversearray(0,3,a);
        System.out.println(46&47);
        
         
        
//        var list=new ArrayList<Integer>();
//        
//        list.add(10);list.add(20);list.add(30);list.add(40);
//        
//        
            
        
        
        
    }
    
}
