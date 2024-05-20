
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author venkatesh
 */
public class python {

    public static void add() {
        List<Integer> list1 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 unique elements");
        int n = 1;
        while (n <= 5) {
            System.out.println("Enter the  " + n + " number: ");
            int num = sc.nextInt();
            if (list1.contains(num)) {
                System.out.println("number is already existed");
                System.out.println("Try again my dear: ");
            } else {
                list1.add(num);
                n++;
            }
        }
        sc.close();
        list1 = null;
    }

    public static void compare() {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = 1;
        System.out.println("enter the 5 number for the first list");
        while (n <= 5) {
            System.out.println("Enter the " + n + " number : ");
            int num = sc.nextInt();
            list1.add(num);
            n++;
        }
        n = 1;
        System.out.println("enter the 5 number for the second list");
        while (n <= 5) {
            System.out.println("Enter the " + n + " number :");
            int num = sc.nextInt();
            list2.add(num);
            n++;
        }
        //  int count = 0;
        List<Integer> commonElements = new ArrayList<>(list1);

        commonElements.retainAll(list2);

        System.out.println(" number of elemtns of common in both list is " + commonElements);

        sc.close();
        list1 = null;
        list2 = null;
        commonElements = null;

    }

    public static void main(String[] args) {
        //  compare();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the alphanumberic");
//        String apl = sc.nextLine();
//        String ap2 = "0123456789";
//        
        int a[] = {10, 9, 8, 7, 6};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int x : a) {
            System.out.print(" " + x);
        }
        System.out.println(" ");

    }
}
