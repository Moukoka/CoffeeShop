package five.domain;

/**
 * Created by Rosie on 2016/04/03.
 */
public class RedTea extends Tea {
    private Size size;
    private Ingredients ingredients;

    public RedTea(Size size, Ingredients ingredients) {
        super(size, ingredients);
        this.size = size;
        this.ingredients = ingredients;
    }


    @Override
    public String toString() {
        return "RedTea {" +
                "Size = " + size +
                ", Ingredients = " + ingredients +
                '}';
    }
}
