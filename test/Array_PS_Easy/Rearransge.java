/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

 

/**
 *
 * @author venkatesh
 */
public class Rearransge {
     public static boolean isPaline(String str) {
    if (str.length() == 1) {
        return true;
    }
    
    StringBuilder rev = new StringBuilder(str);
    rev = rev.reverse();
    
    // Convert both strings to lowercase before comparison
    String original = str.toLowerCase();
    String reversed = rev.toString().toLowerCase();
    
    return original.equals(reversed);
}

    
    public static int[] arrange(int a[]){
        int ans[]=new int[a.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<a.length;i++){
            
            if(a[i]>0){
                ans[pos]=a[i];
                pos+=2;
            }else{
                ans[neg]=a[i];
                neg+=2;
            }
        }
        return ans;
        
    }
    
    public static void main(String[] args) {
       int nums[] = {3,1,-2,-5,2,-4};
//       int ab[]=arrange(nums);
//       for(int x: ab){
//           System.out.print(x+" ");
//       }
        System.out.println(isPaline("m"));
    }
    
}
