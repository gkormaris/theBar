package gr.codeschool.generics.bar.staff;

import gr.codeschool.generics.bar.Order;
import gr.codeschool.generics.bar.drinks.Drink;
import gr.codeschool.generics.bar.drinks.alcohol.AlcoholicDrink;
import gr.codeschool.generics.bar.drinks.soft.SoftDrink;

/**
 * Created by ioanniskormaris on 08/10/2017.
 */
public class Bartender implements Staff<AlcoholicDrink> {

    private String name;

    public Bartender() {

    }

    public Bartender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void serve(AlcoholicDrink drink) {

    }

    @Override
    public void serve(Order<AlcoholicDrink> order) {

    }
}
