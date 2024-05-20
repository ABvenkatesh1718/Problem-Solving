

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author venkatesh
 */
 import java.lang.reflect.Field;

class pass {
    private int a = 10;
    private int b = 20;
    public void display()
    {
        System.out.println("accessing inside the class");
        System.out.println(a +" "+ b);
    }
        
}

public class bypass {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        pass p = new pass();

        // Using reflection to access private variables
        Field fieldA = pass.class.getDeclaredField("a");
        Field fieldB = pass.class.getDeclaredField("b");

        fieldA.setAccessible(true);
        fieldB.setAccessible(true);
        fieldA.setInt(p, 50); // Changing the value of 'a' to 50
        fieldB.setInt(p, 100);

        int aValue = (int) fieldA.get(p);
        int bValue = (int) fieldB.get(p);

        System.out.println("Value of a (accessed using reflection): " + aValue);
        System.out.println("Value of b (accessed using reflection): " + bValue);
        p.display();
    }
}
/*
grant {
   permission java.security.AllPermission;
}; //save with myPolicy.policy in project
*/
//moves to security policy -VM options we can see the customized options set the below command
///-Djava.security.manager  -Djava.security.policy=myPolicy.policy

