
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author venkatesh
 */

 class PrivateClass {
    private int privateVar = 10;

    private void privateMethod() {
        System.out.println("Private method called");
    }
}

public class access {
    
    public static void main(String[] args) throws Exception{
        
        
        
        PrivateClass obj = new PrivateClass();

        // Accessing private variable using reflection
        Field privateVarField = PrivateClass.class.getDeclaredField("privateVar");
        privateVarField.setAccessible(true);
        int privateVarValue = (int) privateVarField.get(obj);
        System.out.println("Private variable value: " + privateVarValue);

        // Accessing private method using reflection
        Method privateMethod = PrivateClass.class.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(obj);

    }

}
