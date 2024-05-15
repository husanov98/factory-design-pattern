package uz.mh.factories;

import uz.mh.interfaces.Dish;
import uz.mh.interfaces.DishFactory;
import uz.mh.model.Pizza;

public class PizzaFactories implements DishFactory {
    @Override
    public Dish createDish() {
        return new Pizza();
    }
}
