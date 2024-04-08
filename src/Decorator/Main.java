package Decorator;

import Decorator.Addons.Milk;
import Decorator.Addons.Whip;

public class Main {

    public static void main(String[] args) {
        Beverage b = new Espresso();

        // Milk will return the beverage object
        b = new Milk(b);

        // Whip will return the beverage object
        b = new Whip(b);

        System.out.println(b.getPrice());
        //S-1: call getPrice of whip
        //S-2: As Whip's Beverage b has instance of Milk, it will call Milk's getPrice
        //S-3: As Milk's Beverage b has instance of Espresso, it will call Espresso's getPrice

        //NOTE:
        // Can we create only an Addon class, say like Milk?
        // Ans: No, and this is because we have intentionally not written default constructor in AddOn classes.
        // Addons need Beverage to be initialised.
    }
}
