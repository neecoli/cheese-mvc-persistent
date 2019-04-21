package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {

    //TODO: two fields to render the form, add accessors to each
    private Menu menu;
    private Iterable<Cheese> cheeses;

    public Menu getMenu() { return menu; }

    //public void setMenu(Menu menu) { this.menu = menu; }

    public Iterable<Cheese> getCheeses() { return cheeses; }

    //public void setCheeses(Iterable<Cheese> cheeses) { this.cheeses = cheeses; }

    //TODO: two fields to process the form, add accessors to each
    @NotNull
    private int menuId;

    @NotNull
    private int cheeseId;

    public int getMenuId() { return menuId; }

    public void setMenuId(int menuId) { this.menuId = menuId; }

    public int getCheeseId() { return cheeseId; }

    public void setCheeseId(int cheeseId) { this.cheeseId = cheeseId; }

    //default no-arg constructor for model binding to work
    public AddMenuItemForm(){}

    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu) {
        this.cheeses = cheeses;
        this.menu = menu;
    }


}
