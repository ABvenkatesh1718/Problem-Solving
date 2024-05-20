/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

/**
 *
 * @author venkatesh
 */
public class SortBinaryNumber {
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int[] sort(int a[]){
        int low=0;
        int high=a.length-1;
        int mid=0;
        while(mid<high){
            if(a[mid]==0){
                swap(a,low,mid);
                mid++;low++;
            }else{
                swap(a,mid,high);
                mid++;high--;
            }
        }
        return a;          
    }
    public static void main(String[] args) {
        int a[]={0,1,0,0,1,1};
        a=sort(a);
        for(int x : a){
            System.out.println(x);
        }
    }
    
}
