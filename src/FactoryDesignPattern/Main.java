package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Components.Menu.Menu;

public class Main {
    public static void main(String[] args) {
        // Changing the platform from IOS to Android, will change all the underlying implementations
        // No need for code change if we want to change the platforms.
        // The Factory Pattern is a creational design pattern that deals with object creation without having to
        // specify the exact class of the object that will be created.
        // This pattern typically takes some input (e.g., a type code or configuration) that determines the specific object to create
        Flutter f = new Flutter(SupportedPlatforms.IOS);
        UIFactory factory = f.createUIFactory();
        Button button = factory.createButton();
        Menu menu = factory.createMenu();
        Dropdown dropdown = factory.createDropdown();
    }
}
