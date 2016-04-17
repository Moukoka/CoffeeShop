package five.factories;

import five.domain.Beverage;
import five.domain.Order;

import java.util.List;

/**
 * Created by Rosie on 2016/04/16.
 */
public class OrderFactory {
    public static Order createOrder(int quantity, double price, List<Beverage> beverageList){
        Order myorder = new Order.Builder(quantity).price(price).bev(beverageList).build();
        return myorder;
    }
}
