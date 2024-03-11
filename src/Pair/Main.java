package Pair;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> p = new Pair<>();

        System.out.println("Before Setting ----");
        System.out.println(p.getX());
        System.out.println(p.getY());
        p.setX(1);
        p.setY(2);
        System.out.println("Before Setting ----");
        System.out.println(p.getX());
        System.out.println(p.getY());

        // Calling static methods
        Pair.doSomething("Malhar", "Deshpande", 2);

        // We can call the Pair without any data type and it will not give me error
        // because generics also offer backward compatibility.
        // This is called as RAW GENERIC TYPES
        Pair p2 = new Pair();


        // This thing will give error while runtime it, as it has different data types
        List l = new ArrayList();
//        l.add(1);
//        l.add("Mal");
//        l.add(12.2);
//
//        for (int i = 0; i < l.size(); i++) {
//            int i = (int)l.get(i);
//        }

    }
}
