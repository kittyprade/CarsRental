package CarsRental;

import javax.persistence.*;
import java.util.Scanner;

import static CarsRental.InterfaceCar.entityManager;

@Entity
@Table(name="CUSTOMERS")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer customers_id;

    @Column(name="First_Name")
    private String firstName;

    @Column(name="Last_Name")
    private String lastName;

    public Customers(){

    }

    public Integer getCustomers_id() {
        return customers_id;
    }

    public void setCustomers_id(Integer customers_id) {
        this.customers_id = customers_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }


}