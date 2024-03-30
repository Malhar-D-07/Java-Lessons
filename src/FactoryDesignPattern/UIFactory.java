package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Components.Menu.Menu;

public interface UIFactory {
    Button createButton();

    Menu createMenu();

    Dropdown createDropdown();
}
