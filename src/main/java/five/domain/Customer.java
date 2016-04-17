package five.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Rosie on 2016/04/03.
 */

@Entity
public class Customer implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name = null;
    private String cellNumber = null;
    private String email = null;
    @Embedded
    private Address address;

    public Customer() {
    }
    /*public void waitForOrder(){
         System.out.println("Your order is being prepared");
     }
    public void collectOrder(){
        System.out.println("Smile, your order is ready");

    }*/

    public Long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getName() {
        return name;
    }

    private Customer(Builder builder) {
        this.name = builder.name;
        this.cellNumber = builder.cellNumber;
        this.email = builder.email;
        this.address = builder.ad;
    }

    public static class Builder{
        private String name;
        private String cellNumber;
        private String email;
        private Address ad;
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

        public Builder address(Address adr){
            this.ad = adr;
            return this;
        }
        public Builder copy(Customer value) {
            this.name = value.name;
            this.cellNumber = value.cellNumber;
            this.email = value.email;
            this.ad = value.address;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }


}
