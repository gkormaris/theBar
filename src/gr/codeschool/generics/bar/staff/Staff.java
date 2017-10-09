package gr.codeschool.generics.bar.staff;

import gr.codeschool.generics.bar.Order;

public interface Staff<T> {

    void serve(T drink);

    void serve(Order<T> order);

    String getName();
}
