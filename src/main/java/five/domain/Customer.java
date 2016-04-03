package five.domain;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/04/03.
 */

public class Customer implements Serializable {
    private  String name = null;
    private String cellNumber = null;
    private String email = null;

   /* public Customer(String name, String cellNumber, String email) {
        this.name = name;
        this.cellNumber = cellNumber;
        this.email = email;
    }*/

    public Customer() {
    }
     public void waitForOrder(){
         System.out.println("Your order is being prepared");
     }
    public void collectOrder(){
        System.out.println("Smile, your order is ready");

    }

    public String getName() {
        return name;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getEmail() {
        return email;
    }

    private Customer(Builder builder) {
        this.name = builder.name;
        this.cellNumber = builder.cellNumber;
        this.email = builder.email;
    }

    public static class Builder{
        private String name;
        private String cellNumber;
        private String email;

        public Builder (String value){
            this.name = value;

        }
        public Builder cellNumber(String value){
            this.cellNumber = value;
            return this;
        }
        public Builder email(String value){
            this.email = value;
            return this;
        }

        public Builder copy(Customer value) {
            this.name = value.name;
            this.cellNumber = value.cellNumber;
            this.email = value.email;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!getName().equals(customer.getName())) return false;
        if (!getCellNumber().equals(customer.getCellNumber())) return false;
        return getEmail().equals(customer.getEmail());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getCellNumber().hashCode();
        result = 31 * result + getEmail().hashCode();
        return result;
    }
}
