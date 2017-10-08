package gr.codeschool.generics.bar;

import gr.codeschool.generics.bar.drinks.soft.Coffee;
import gr.codeschool.generics.bar.drinks.soft.SoftDrink;
import gr.codeschool.generics.bar.drinks.soft.Tea;
import gr.codeschool.generics.bar.staff.Barista;
import gr.codeschool.generics.bar.staff.Bartender;

/**
 * Created by ioanniskormaris on 08/10/2017.
 */
public class Main {

    public static void main(String... args) {
        Order<SoftDrink> order = new Order<>();

        order.add(new Tea());
        order.add(new Coffee());

        Barista mike = new Barista("mike");
        Bartender sotiris = new Bartender("sotiris");

        mike.serve( order);

//        sotiris.serve(order);
    }
}
