/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

import java.util.logging.*;

/**
 *
 * @author venkatesh
 */
class parent {

    protected void p1() {
        System.out.println("from parent");
    }
}

class child extends parent {

    protected void p1() {
        System.out.println("from child bro");
    }
}

public class UseOfLog {

    private static final Logger logger = Logger.getLogger(LinkedList.UseOfLog.class.getName());

    public static void main(String[] args) {

//        int a = 1, b = 0;
//        try {
//
//            System.out.println("division is " + (a / b));
//        } catch (Exception e) {
//                logger.log(Level.WARNING,"SARIGA INPUT EEVU BRO");
//        }
//        logger.log(Level.INFO,"try again bro");
//        logger.log(Level.SEVERE,"thank you for using our program bro");
    }

}
