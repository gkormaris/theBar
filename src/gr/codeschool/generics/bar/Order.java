package gr.codeschool.generics.bar;

import gr.codeschool.generics.bar.drinks.Drink;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ioanniskormaris on 08/10/2017.
 */
public class Order<D> {

    private int tableNumber;

    private List<D> drinks;

    public Order() {
        drinks = new ArrayList<D>();
    }

    public List<D> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<D> drinks) {
        this.drinks = drinks;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void add(D drink) {
        drinks.add(drink);
    }

    public void remove(D drink) {
        drinks.remove(drink);
    }
}