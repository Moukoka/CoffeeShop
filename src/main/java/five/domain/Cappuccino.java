package five.domain;

/**
 * Created by Rosie on 2016/04/03.
 */
public class Cappuccino extends Expresso {
    private Ingredients extraIngredients;

    public Cappuccino(Size size, Ingredients ingredients, Ingredients extraIngredients) {
        super(size, ingredients);
        this.extraIngredients = extraIngredients;
    }

    @Override
    public String toString() {
        return "This Cappuccino of " + "Size = " + super.getSize() + ", is made of " + super.getBaseIngredients() +
                " and a touch of " + extraIngredients;
    }
}
