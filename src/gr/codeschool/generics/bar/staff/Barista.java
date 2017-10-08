package gr.codeschool.generics.bar.staff;

import gr.codeschool.generics.bar.Order;
import gr.codeschool.generics.bar.drinks.Drink;
import gr.codeschool.generics.bar.drinks.soft.SoftDrink;

/**
 * Created by ioanniskormaris on 08/10/2017.
 */
public class Barista implements Staff<SoftDrink> {

    private String name;

    public Barista() {

    }

    public Barista(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void serve(Order<SoftDrink> order) {

    }

    @Override
    public void serve(SoftDrink drink) {

    }
}
