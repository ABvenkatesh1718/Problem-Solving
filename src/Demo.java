
import java.util.logging.Handler;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author venkatesh
 */
interface inter{
    public  final int a=10;
    public static final int b[]={1,2,3,4,5};
    
    
}
public class Demo {
    
    

    private int id;
    private String name;
    private String roll_no;
     
    public static void main(String[] args) {
        
          
//        inter.b[0]=9;
//        //inter.a=8;
//        for( int x : inter.b){
//            System.out.println(x);
//        }
    float a=10,b=49;
    float c=a+b;
        System.out.println("hi");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Demo(int id, String name, String roll_no) {
        this.id = id;
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addHandler(Handler handler) throws SecurityException {
        LOG.addHandler(handler);
    }

    public String getRoll_no() {
        return roll_no;
    }
    private static final Logger LOG = Logger.getLogger(Demo.class.getName());

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Demo{" + "id=" + id + ", name=" + name + ", roll_no=" + roll_no + '}';
    }

}
