package gr.codeschool.generics.bar;

import gr.codeschool.generics.bar.drinks.Drink;
import gr.codeschool.generics.bar.drinks.Water;
import gr.codeschool.generics.bar.drinks.alcohol.AlcoholicDrink;
import gr.codeschool.generics.bar.drinks.alcohol.Rum;
import gr.codeschool.generics.bar.drinks.refreshments.Coke;
import gr.codeschool.generics.bar.drinks.soft.Coffee;
import gr.codeschool.generics.bar.drinks.soft.SoftDrink;
import gr.codeschool.generics.bar.drinks.soft.Tea;
import gr.codeschool.generics.bar.drinks.soft.TeaIF;
import gr.codeschool.generics.bar.staff.Barista;
import gr.codeschool.generics.bar.staff.Bartender;
import gr.codeschool.generics.bar.staff.Waiter;

public class Main {

    public static void main(String... args) {
        Order<Drink> mixedOrder = new Order<>();
        mixedOrder.add(new Rum());
        mixedOrder.add(new Coke());

        Order<SoftDrink> softDrinkOrder = new Order<>();
        softDrinkOrder.add(new Tea());
        softDrinkOrder.add(new Coffee());

        Order<TeaIF> teaOrder = new Order<>();

//        order.add(new Rum());
        Barista mike = new Barista("mike");
        Bartender sotiris = new Bartender("sotiris");

        Waiter<Drink> yannis = new Waiter<>("yannis");
        Waiter<Water> mitsos = new Waiter<>("mitsos");
        Waiter<AlcoholicDrink> andreas = new Waiter<>("andreas");

        mike.serve( softDrinkOrder);
//        sotiris.serve(order);

//        mike.serve(mixedOrder);
//        sotiris.serve(mixedOrder);

        yannis.serve(mixedOrder);

//        mitsos.serve(mixedOrder);
//        andreas.serve(mixedOrder);
    }
}
