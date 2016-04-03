package five.factories.Impl;

import five.domain.*;
import five.factories.CoffeeFactory;

/**
 * Created by Rosie on 2016/04/03.
 */
public class CoffeeFactoryImpl implements CoffeeFactory {

    private static CoffeeFactoryImpl factory = null;

    public CoffeeFactoryImpl() {
    }
    public static CoffeeFactoryImpl getInstance(){
        if(factory ==null)
            factory = new CoffeeFactoryImpl();
        return factory;
    }
    public Coffee makeExpresso(Size size, Ingredients ingredients) {
        Coffee cof1 = new Expresso(size, ingredients);
        return cof1;
    }

    public Coffee makeDecaf(Size size, Ingredients ingredients) {
        Coffee cof2 = new Decaf(size, ingredients);
        return cof2;
    }
}
