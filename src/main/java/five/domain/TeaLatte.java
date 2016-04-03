package five.domain;

/**
 * Created by Rosie on 2016/04/03.
 */
public class TeaLatte extends Tea {
    private Size size;
    private Ingredients ingredients;

    public TeaLatte(Size size, Ingredients ingredients, Size size1, Ingredients ingredients1) {
        super(size, ingredients);
        this.size = size1;
        this.ingredients = ingredients1;
    }
    /*public TeaLatte(Size size, Ingredients ing1) {
        this.size = size;
        this.ingredients = ing1;
    }*/
    @Override
    public String toString() {
        return "TeaLatte{" +
                "Size=" + size +
                ", Ingredients=" + ingredients +
                '}';
    }
}
