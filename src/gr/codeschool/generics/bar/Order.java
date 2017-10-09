package gr.codeschool.generics.bar;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {

    private int tableNumber;

    private List<T> drinks;

    public Order() {
        drinks = new ArrayList<T>();
    }

    public List<T> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<T> drinks) {
        this.drinks = drinks;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void add(T drink) {
        drinks.add(drink);
    }

    public void remove(T drink) {
        drinks.remove(drink);
    }
}