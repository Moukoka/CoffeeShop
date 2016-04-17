package five.factories;

import five.domain.Address;

/**
 * Created by Rosie on 2016/04/17.
 */
public class AddressFactory  {
    public static Address createAddress(String street, String suburb, String postcode){

        Address adress = new Address
                .Builder(street)
                .suburb(suburb)
                .postalCode(postcode)
                .build();
        return adress;
    }


}
