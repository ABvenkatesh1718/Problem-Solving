/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
public class SshapePrintingMatrix {
    public static void printSpiral(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print rightmost column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print bottom row (if it's not the same as the top row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print leftmost column (if it's not the same as the rightmost column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
    
    void Sshape(int [][]a ,int n)
    {
       // int i=0,j=0;
        for(int i=0;i<n;i++)
        {
            if (i%2 == 0)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.printf(" %d  ",a[i][j]);
                }       
            }
            else
            {
                for(int j=n-1;j>=0;j--)
                {
                    System.out.printf(" %d ",a[i][j]);
                }
            }
                
        }
        System.out.println(" ");
            
    }
        
    
    public static void main(String[] args) {
        
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
                
        };
        int n=a.length;
        SshapePrintingMatrix obj= new SshapePrintingMatrix();
        obj.Sshape(a, n);
       // SshapePrintingMatrix.printSpiral(a);
       
        
      
    }
    
}
