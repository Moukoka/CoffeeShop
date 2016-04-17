package five.factories;


import five.domain.Address;
import five.domain.Customer;

/**
 * Created by Rosie on 2016/04/03.
 */
public class CustomerFactory {
    public static Customer createCustomer(String name, String cell, String email, Address ad){

        Customer cust = new Customer
                .Builder(name)
                .cellNumber(cell)
                .email(email)
                .address(ad)
                .build();
        return cust;
    }



}
