package Decorator.Addons;

import Decorator.Beverage;

public class Whip implements Addons{
    Beverage b;

    public Whip(Beverage bev) {
        this.b = bev;
    }

    @Override
    public int getPrice() {
        // This will call the b's getPrice method and add 40 to it
        return b.getPrice() + 40;
    }
}
