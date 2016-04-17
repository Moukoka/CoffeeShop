package five.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Rosie on 2016/04/17.
 */
@Embeddable
public class Address implements Serializable {
    private String street, suburb;
    String postalCode;

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Address(Builder builder) {
        this.street = builder.street;
        this.suburb = builder.suburb;
        this.postalCode = builder.postalCode;
    }

    public static class Builder{
        private String street;
        private String suburb;
        private String postalCode;

        public Builder(String street) {
            this.street = street;
        }

        public Builder suburb(String value){
            this.suburb=value;
            return this;
        }

        public Builder postalCode(String value){
            this.postalCode=value;
            return this;
        }

        public Builder copy(Address value){
            this.street = value.street;
            this.postalCode=value.postalCode;
            this.suburb=value.suburb;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
