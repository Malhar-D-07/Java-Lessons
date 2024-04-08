package Decorator.Addons;

import Decorator.Beverage;

public class Wafer implements Addons{
    Beverage b;

    Wafer(Beverage bev) {
        this.b = bev;
    }

    @Override
    public int getPrice() {
        // This will call the b's getPrice method and add 15 to it
        return b.getPrice() + 15;
    }
}
