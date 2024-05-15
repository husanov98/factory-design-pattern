package uz.mh;

import uz.mh.factories.PizzaFactories;
import uz.mh.factories.SushiFactory;
import uz.mh.interfaces.Dish;
import uz.mh.interfaces.DishFactory;

public class PizzaMain {
    public static void main(String[] args) {
        DishFactory pizzaFactory = new PizzaFactories();
        Dish pizza = pizzaFactory.createDish();
        pizza.prepare();
        pizza.serve();

        DishFactory sushiFactory = new SushiFactory();
        Dish sushi = sushiFactory.createDish();
        sushi.prepare();
        sushi.serve();
    }
}
