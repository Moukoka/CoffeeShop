package five.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
/**
 * Created by Rosie on 2016/04/03.
 */
@Embeddable
public abstract class Beverage implements Serializable {


    /* Entity Joins */
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "")
    Size size;

    @OneToMany (fetch = FetchType.EAGER)
    @JoinColumn(name = "")
    List<Ingredients> ingredients;


    Beverage() {
    }

    public Size getSize(){
        return size;
    }
    public Ingredients getBaseIngredients(){
        return ingredients.get(1);
    }

    private Beverage(Builder builder) {
        this.size = builder.siz;
        this.ingredients = builder.ingredient;
    }

    public static class Builder{
        private Size siz;
        private List <Ingredients> ingredient;

        public Builder (Size value){
            this.siz = value;
        }

        public Builder ingredient(List<Ingredients> value){
            this.ingredient = value;
            return this;
        }

        public Builder copy(Beverage value) {
            this.siz= value.size;
            this.ingredient = value.ingredients;
            return this;
        }
        //build not done coz cannot instantiate an abstract class

        public Beverage build(){
            return new Beverage(this) {
                @Override
                public Size getSize() {
                    return super.getSize();
                }

                @Override
                public Ingredients getBaseIngredients() {
                    return super.getBaseIngredients();
                }
            };
        }

    }

    @Override
    public String toString() {
        return "Beverage{" +
                ", size=" + size +
                ", ingredients=" + ingredients +
                '}';
    }
}
