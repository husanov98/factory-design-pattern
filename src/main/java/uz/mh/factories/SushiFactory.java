package uz.mh.factories;

import uz.mh.interfaces.Dish;
import uz.mh.interfaces.DishFactory;
import uz.mh.model.Sushi;

public class SushiFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Sushi();
    }
}
