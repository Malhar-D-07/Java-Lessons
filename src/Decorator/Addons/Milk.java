package Decorator.Addons;

import Decorator.Beverage;

public class Milk implements Addons {
    Beverage b;

    public Milk(Beverage bev) {
        this.b = bev;
    }
    @Override
    public int getPrice() {
        // This will call the b's getPrice method and add 20 to it
        return b.getPrice() + 20;
    }
}
