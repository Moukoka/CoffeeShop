package five.domain;

/**
 * Created by Rosie on 2016/04/03.
 */
public class Order {
    Beverage beverage;
    int quantity =0;
    double price;

    public Order(Beverage beverage, int quantity, double price) {
        this.beverage = beverage;
        this.quantity = quantity;
        this.price = price;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice(){return price;}
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double total(){
        return (quantity*price);
    }
}
