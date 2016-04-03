package five.factories.Impl;

import five.domain.*;
import five.factories.ExpressoFactory;

/**
 * Created by Rosie on 2016/04/03.
 */
public class ExpressoFactoryImpl implements ExpressoFactory {

    private static ExpressoFactoryImpl factory = null;

    public ExpressoFactoryImpl() {
    }

    public static ExpressoFactoryImpl getInstance(){
        if(factory ==null)
            factory = new ExpressoFactoryImpl();
        return factory;
    }

    public Expresso makeCappuccino(Size size, Ingredients ingredients,Ingredients extra) {
        Expresso ex1 = new Cappuccino(size, ingredients,extra);
        return ex1;
    }

    public Expresso makeLatte(Size size, Ingredients ingredients,Ingredients extra) {
        Expresso ex2 = new Latte(size, ingredients,extra);
        return ex2;
    }
}
