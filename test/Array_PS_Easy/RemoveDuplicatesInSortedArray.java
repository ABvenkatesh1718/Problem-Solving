/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

/**
 *
 * @author venkatesh
 */
public class RemoveDuplicatesInSortedArray {
    public static int removeduplicate(int a[],int n){
        
        java.util.Arrays.sort(a);//for unsorted array;
        int i=0;
        for(int j=1;j<n;j++){
            if(a[i]!=a[j]){
                a[i+1]=a[j];
                i++;
            }
        }
         for(int j=0;j<(i+1);j++){
             System.out.print(a[j]+" ");
         }
         System.out.println(" ");
        
        return  i+1;
    }
    public static void main(String[] args) {
        int a[]={5,4,3,2,2,2,1};
        System.out.println( removeduplicate(a,7));
    }
    
}
