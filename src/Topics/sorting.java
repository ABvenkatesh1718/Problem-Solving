/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topics;

/**
 *
 * @author venkatesh
 */
interface Black {

    default void getColor() {
        System.out.print("Black");
    }
}

interface Red extends Black {

    default void getColor() {
        System.out.print("Red");
    }
}

interface Gold {

    static void getColor() {
        System.out.print("Gold");
    }
}

public class sorting implements Black, Red {

    public static void main(String[] args) {
        sorting colors = new sorting();
        colors.getColor();
        Gold.getColor();

    }
}
//What is the result of running this code?
//Compiler error, error: types Black and Red are incompatible;
//
//Prints: Gold
//
//Prints: Red
//
//Prints: Black

