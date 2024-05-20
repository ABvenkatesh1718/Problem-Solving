/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

/**
 *
 * @author venkatesh
 */
// 2 3 4 7 11 K=5 ANS: 9
public class FindMissingElementWithKposition {
    
    public static int missingelement(int a[],int n,int k){
         
        for(int i=0;i<n-1;i++){
            if(a[i]<=k){
                k++;
            }else{
                return k;
            }
        }
        return -1;
        
    }
    public static int missingelement1(int a[],int n,int k){
         
        int low=0,high=n-1;
        
        while(low <= high){
            int mid=(low+high)/2;
            int mis=a[high]-(mid+1);
            if(mis <k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return k+high+1;
        
    }
    
    public static void main(String[] args) {
        int a[]={2,3,4,7,11};
        System.out.println(missingelement1(a,5,2));
    }
    
}
