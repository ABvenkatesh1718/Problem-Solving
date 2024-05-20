
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author venkatesh
 */
public class Stream {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 10; i <= 100; i += 10) {
            list.add(i);
        }

      //  list.stream().forEach(n->{System.out.print(" " + n);});
      List<Integer>my=list.stream().filter(n->n>50).collect(Collectors.toList());
        System.out.println(my);
    }

}
