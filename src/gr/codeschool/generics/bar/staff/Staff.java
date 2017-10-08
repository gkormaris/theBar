package gr.codeschool.generics.bar.staff;

import gr.codeschool.generics.bar.Order;
import gr.codeschool.generics.bar.drinks.Drink;

/**
 * Created by ioanniskormaris on 08/10/2017.
 */
public interface Staff<D> {

    void serve(D drink);

    void serve(Order<D> order);

    String getName();
}
