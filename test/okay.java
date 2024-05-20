
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author venkatesh
 */


public class okay {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\venkatesh\\OneDrive\\Desktop\\A)stegnography\\New Text Document.txt";
       /* 
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Display each line of the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
      
        try (FileReader fileReader = new FileReader(filePath)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                  System.out.println(fileReader.read());
                System.out.print((char) character); // Display each character of the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
