package five.domain;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/04/03.
 */
public class Cashier implements Serializable{
    private String employeeID = null;
    private String name;

    public void takeOrder(){
        System.out.println("Hello, what would you like to have?");
    }

    public Cashier() {
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    private Cashier(Builder builder) {
        this.employeeID = builder.employeeID;
        this.name = builder.name;
    }

    public static class Builder{
        private String name;
        private String employeeID;

        public Builder employeeID(String value){
            this.employeeID = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder copy(Cashier value) {
            this.employeeID = value.employeeID;
            this.name = value.name;
            return this;
        }

        public Cashier build() {
            return new Cashier(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cashier cashier = (Cashier) o;

        if (getEmployeeID() != null ? !getEmployeeID().equals(cashier.getEmployeeID()) : cashier.getEmployeeID() != null)
            return false;
        return getName() != null ? getName().equals(cashier.getName()) : cashier.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = getEmployeeID() != null ? getEmployeeID().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
