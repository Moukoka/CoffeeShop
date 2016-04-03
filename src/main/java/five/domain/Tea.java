package five.domain;

/**
 * Created by Rosie on 2016/04/03.
 */
public abstract class Tea implements Beverage {
    private Size size;
    private Ingredients ingredients;

    public Tea(Size size, Ingredients ingredients) {
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

    public Ingredients getBaseIngredients() {
        return ingredients;
    }

}
