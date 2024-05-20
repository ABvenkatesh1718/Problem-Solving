/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author venkatesh
 */
public class Pattern {
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               if(i+j>3)
               {
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
               
            }
            System.out.println(" ");
        }
    }
    
}
