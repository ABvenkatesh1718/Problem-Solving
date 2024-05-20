/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author venkatesh
 * @since learned
 * @version 1.0
 **/
 
import java.util.StringTokenizer;

 public class practice {

    public static void main(String[] args) {
        String str = "a+b=45;";
        String deli = "=+-/";

        StringTokenizer st = new StringTokenizer(str, deli,true);
//        while (st.hasMoreTokens()) {
//            String s = st.nextToken();
//            System.out.println(s);
//        }

          //System.out.println(Boolean.getBoolean(deli));
          
          
          Integer value=Integer.valueOf(10);
          Integer value1=Integer.valueOf(10);
          System.out.println( System.identityHashCode(value));
          System.out.println(System.identityHashCode(value1));
    }
}
