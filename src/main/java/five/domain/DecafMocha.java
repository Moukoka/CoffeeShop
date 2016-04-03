package five.domain;

/**
 * Created by Rosie on 2016/04/03.
 */
public class DecafMocha extends Decaf {
    private Ingredients extraIngredients;

    public DecafMocha(Size size, Ingredients ingredients, Ingredients extraIngredients) {
        super(size, ingredients);
        this.extraIngredients = extraIngredients;
    }

    @Override
    public String toString() {
        return "This Decaf Mocha of {" + "Size =" + super.getSize() + ", is made of " + super.getBaseIngredients() +
                "a touch of " + extraIngredients +
                '}';
    }
}
