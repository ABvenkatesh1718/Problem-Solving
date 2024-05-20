/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topics;

/**
 *
 * @author venkatesh
 */
// Java program to find maximum sum in a circular array
// such that no elements are adjacent in the sum.
public class circular{
    
    public static int max(int a[]){
       int max=a[0];
        for(int i=1;i<a.length;i++){
             if(a[i]>max){
                 max=a[i];
             }
        }
        return max;
    }
    
    
    public static int maxsum(int a[],int n){
        
        
        if(n<0){
            return 0;
        }
        if(n == 0){
            return a[0];
        }
        if(n==2){
            return 0;
        }
        if(n==3){
            return max(a);
        }
        
        
        int incl=a[0];
        int excl=0;
        int excl_new;
        int i;
        for(i=1;i<n;i++){
            excl_new=(incl>excl)?incl:excl;
            incl=excl+a[i];
            excl=excl_new;   
        }
        return ((incl > excl)?incl:excl);
        
    }

// calculate the maximum stolen value	 
    static int helper(int arr[], int l, int n) {
        // base case
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return arr[0];
        }

        // if current element is pick then previous cannot be
        // picked
        int pick = arr[n] + helper(arr, l, n - 2);
        // if current element is not picked then previous
        // element is picked
        int notPick = helper(arr, l, n - 1);

        // return max of picked and not picked
        return Math.max(pick, notPick);
    }

    static int findMaxSum(int arr[], int n) {
        // case 1: Last element is excluded we have to calculate
        // result for first n-1 houses.
        int ans1 = helper(arr, 0, n - 1);
        // case 2: First element is excluded we have to
        // calculate result 2 to n houses.
        int ans2 = helper(arr, 1, n - 1);
        return Math.max(ans1, ans2);
    }
// Driver Code

    public static void main(String[] args) {

        int arr[] = {4,2,3,6};
        int n = arr.length;
        System.out.println("Maximum loot possible : " + maxsum(arr, n));
    }
}
//this article is contributed by aditya942003patil
 