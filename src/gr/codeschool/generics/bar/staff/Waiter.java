package gr.codeschool.generics.bar.staff;

import gr.codeschool.generics.bar.Order;
import gr.codeschool.generics.bar.drinks.Drink;
import gr.codeschool.generics.bar.drinks.Water;

/**
 * Created by ioanniskormaris on 08/10/2017.
 */
public class Waiter<T extends Drink> implements Staff<T> {

    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    @Override
    public void serve(T drink) {

    }

    @Override
    public void serve(Order<T> order) {

    }

    @Override
    public String getName() {
        return name;
    }
}
