package five.factories;

import five.domain.Coffee;
import five.domain.Ingredients;
import five.domain.Size;

/**
 * Created by Rosie on 2016/04/03.
 */
public interface CoffeeFactory {
    Coffee makeExpresso(Size size, Ingredients ingredients);
    Coffee makeDecaf(Size size, Ingredients ingredients);

}
