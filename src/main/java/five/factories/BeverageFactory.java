package five.factories;

import five.domain.Beverage;
import five.domain.Ingredients;
import five.domain.Size;

import java.util.List;

/**
 * Created by Rosie on 2016/04/16.
 */
public interface BeverageFactory {
    Beverage createBeverage(Size size, List<Ingredients> ingredients);
}
