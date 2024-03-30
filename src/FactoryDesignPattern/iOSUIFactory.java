package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Button.iOSButton;
import FactoryDesignPattern.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Components.Dropdown.iOSDropdown;
import FactoryDesignPattern.Components.Menu.Menu;
import FactoryDesignPattern.Components.Menu.iOSMenu;

public class iOSUIFactory implements UIFactory {


    @Override
    public Button createButton() {
        return new iOSButton();
    }

    @Override
    public Menu createMenu() {
        return new iOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new iOSDropdown();
    }
}
