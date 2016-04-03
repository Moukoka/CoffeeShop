package five.domain;

/**
 * Created by Rosie on 2016/04/03.
 */
public abstract class Coffee implements Beverage {
    private Size size;
    private Ingredients ingredients;

    public Coffee(Size size, Ingredients ingredients) {
        this.size = size;
        this.ingredients = ingredients;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public Ingredients getBaseIngredients() {
        return ingredients;
    }


}
