package DesignPatterns;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.hashCode());

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.hashCode());

    }

}
