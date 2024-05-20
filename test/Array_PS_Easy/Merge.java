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
public class Merge {
    public static int [] merge(int a[],int b[]){
        int i=0;
        int j=0;int k=0;
        int c[]=new int[a.length+b.length];
        while(i < a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
        }
        for( ; i<a.length;i++){
            c[k++]=a[i];
        }
        for( ; j<b.length;j++){
            c[k++]=b[j];
        }
        return c;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
     //   merge(a,b);
        System.out.println(Arrays.toString(merge(a,b)));
        
    }
    
}
