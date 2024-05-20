
import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author venkatesh
 */
public class demo1 {

    

    public static void main(String[] args) {
        
        
       int[] numbers = {1, 2, 3, 4, 5};

        // Convert int array to IntStream (primitive stream)
        IntStream stream = Arrays.stream(numbers);
        

        // Perform operations on the stream
        stream
            .filter(n-> n%2==0)
            .map(n -> n * 2) // Example: doubling each element
            .forEach(System.out::println); // Printing 
    }
     

}
