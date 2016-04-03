package five.factories;

import five.domain.Expresso;
import five.domain.Ingredients;
import five.domain.Size;

/**
 * Created by Rosie on 2016/04/03.
 */
public interface ExpressoFactory {
    Expresso makeCappuccino(Size size, Ingredients ingredients,Ingredients extra);
    Expresso makeLatte(Size size, Ingredients ingredients,Ingredients extra);

}
