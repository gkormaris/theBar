package gr.codeschool.generics.bar.staff;

import gr.codeschool.generics.bar.Order;
import gr.codeschool.generics.bar.drinks.Water;

/**
 * Created by ioanniskormaris on 08/10/2017.
 */
public class Waiter implements Staff<Water> {

    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    @Override
    public void serve(Water drink) {

    }

    @Override
    public void serve(Order<Water> order) {

    }

    @Override
    public String getName() {
        return name;
    }
}
