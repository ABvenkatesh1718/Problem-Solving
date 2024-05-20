/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

/**
 *
 * @author venkatesh
 */
public class MoveZeroToEnd {
    
     public static int[] moveZeros(int n, int []a) {
        int j=-1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
         if(j==-1){
             return a;
         }
        for(int i=j+1;i<n;i++){
            if(a[i] != 0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        return a;
    }
    
}
