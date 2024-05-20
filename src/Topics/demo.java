/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * s
 *
 * @author venkatesh
 */
 
 
public class demo {

   
    public static void main(String[] args) {
        
        
        int a[]={1,2,3,4,5};
     boolean b=  Arrays.stream(a).allMatch(s->s%2==0);
        System.out.println(b);
         
       

    }
     public static void file() {

        try {
            try (FileReader fis = new FileReader("C:\\Users\\venkatesh\\OneDrive\\Desktop\\IO\\text.txt")) {

                int x;
                while ((x = fis.read()) != -1) {
                    System.out.print((char) x);
                }
                System.out.println(" ");

            }

        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (IOException e) {
            System.out.println(e);
        }
    }


}
