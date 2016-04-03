package five.domain;

/**
 * Created by Rosie on 2016/04/03.
 */
public class Expresso extends Coffee {
    private Size size;
    private Ingredients ingredients;

    public Expresso(Size size, Ingredients ingredients) {
        super(size, ingredients);
        this.size = size;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "This Expresso of " +
                "size " + size +
                ",is made of " + ingredients ;
    }

}
