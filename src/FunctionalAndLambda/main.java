package FunctionalAndLambda;

import java.util.*;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Lambda l = new Lambda();
        Thread t = new Thread(l);
        t.start();

        // Using lambda
        Runnable r = () -> {
            System.out.println("In Lambda Expression");
        };
        Thread t1 = new Thread(r);
        t1.start();

        List<Integer> listx = new ArrayList<>();

        listx.add(11);
        listx.add(16);
        listx.add(4);
        listx.add(9);
        listx.add(-1);
        listx.add(10);

        // TERMINAL : Terminal
        // INTERMIDIATORY OPN: Filter, MAP

        Stream<Integer> s1 = listx.stream();

//        s1.forEach((elm)->{System.out.println(elm);});

        Stream<Integer> s2 = listx.stream();

//        s2.filter((elm)->{
//            System.out.println("Filtering data "+ elm);
//            return elm%2==0;
//        }).forEach((elm)->{
//            System.out.println("Printing: " + elm);
//        });

        Stream<Integer> s3 = s2.filter((elm)->{
//            System.out.println("Filtering data "+ elm);
            return elm%2==0;
        });

//        s3.forEach((elm)->{System.out.println(elm);});
        s2.forEach((elm)->{System.out.println(elm);});

    }
}
