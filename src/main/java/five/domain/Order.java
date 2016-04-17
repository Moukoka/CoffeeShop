package five.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Rosie on 2016/04/03.
 */
@Entity
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int quantity =0;
    private double price;
    @Embedded
    private List<Beverage> beverages;

    public Order() {
    }

    public int getQuantity() {
        return quantity;
    }

    public Long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public double total(){
        return (quantity*price);
    }

    public Order(Builder builder) {
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.beverages = builder.beverages;
        this.id = builder.id;
    }

    public static class Builder{
        private Long id;
        private int quantity;
        private double price;
        private List<Beverage> beverages;

        public Builder (int value){
            this.quantity=value;
        }

        public Builder id (Long value) {
            this.id = value;
            return this;
        }

        public Builder price(double pr){
            this.price=pr;
            return this;
        }

        public Builder bev(List<Beverage> value){
            this.beverages=value;
            return this;
        }

        public Builder copy(Order value){
            this.id=value.id;
            this.quantity = value.quantity;
            this.id=value.id;
            this.beverages=value.beverages;
            return this;
        }

        public Order build(){
            return new Order(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (getQuantity() != order.getQuantity()) return false;
        if (Double.compare(order.getPrice(), getPrice()) != 0) return false;
        return getId().equals(order.getId()) && getBeverages().equals(order.getBeverages());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId().hashCode();
        result = 31 * result + getQuantity();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getBeverages().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                ", beverages=" + beverages +
                '}';
    }
}
