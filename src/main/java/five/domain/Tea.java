package five.domain;

import java.util.List;

/**
 * Created by Rosie on 2016/04/03.
 */
public class Tea extends Beverage {
    private Size size;
    private List<Ingredients> ingredients;

    public Tea(Size size, List<Ingredients> ingredients) {
        this.size = size;
        this.ingredients = ingredients;
    }


    public Size getSize() {
        return size;
    }
    public Size setSize(Size s) {
        this.size = s;
        return size;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }
}
