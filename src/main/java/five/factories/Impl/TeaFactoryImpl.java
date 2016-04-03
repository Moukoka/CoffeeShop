package five.factories.Impl;

import five.domain.*;
import five.factories.TeaFactory;

/**
 * Created by Rosie on 2016/04/03.
 */
public class TeaFactoryImpl implements TeaFactory {

    private static TeaFactoryImpl factory = null;

    public TeaFactoryImpl() {
    }
    public static TeaFactoryImpl getInstance(){
        if(factory ==null)
            factory = new TeaFactoryImpl();
        return factory;
    }
    public Tea makeGreenTea(Size size, Ingredients ingredients) {
        Tea t1 = new GreenTea(size, ingredients);

        return t1;
    }
    public Tea makeRedTea(Size size, Ingredients ingredients){
        Tea t2 = new RedTea(size, ingredients);
        return  t2;
    }
    /*public Tea makeTeaLatte(Size size, Ingredients ingredients){
        Tea t3 = new TeaLatte(size, ingredients);
        return t3;
    }*/

}
