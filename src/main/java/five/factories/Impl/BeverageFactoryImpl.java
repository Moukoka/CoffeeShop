package five.factories.Impl;

import five.domain.Beverage;
import five.domain.Ingredients;
import five.domain.Size;
import five.factories.BeverageFactory;

import java.util.List;

/**
 * Created by Rosie on 2016/04/16.
 */
public class BeverageFactoryImpl implements BeverageFactory {

    public Beverage createBeverage(Size size, List<Ingredients> ingr) {
        Beverage bev = new Beverage.Builder(size).ingredient(ingr).build();
        return null;
    }
}
