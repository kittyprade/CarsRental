package CarsRental;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="RENTAL")

public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer rental_id;

    @Column(name="rental_start_date")
    private LocalDate rentalStartData;

    @Column(name="return_car_date")
    private LocalDate returnCarDate;

    @ManyToOne
    @JoinColumn(name = "cars_id")
    private Cars cars;

    @ManyToOne
    @JoinColumn(name = "customers_id")
    private Customers customers;

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;

    }

    public Rental() {

    }

    public Integer getRental_id() {
        return rental_id;
    }

    public void setRental_id(Integer rental_id) {
        this.rental_id = rental_id;
    }

    public LocalDate getRentalStartData() {
        return rentalStartData;
    }

    public void setRentalStartData(LocalDate rentalStartData) {
        this.rentalStartData = rentalStartData;
    }

    public LocalDate getReturnCarDate() {
        return returnCarDate;
    }

    public void setReturnCarDate(LocalDate returnCarDate) {
        this.returnCarDate = returnCarDate;
    }

    public void getCars_id() {
    }
    public void getCustomers_id(){

    }


    public void setCars_id(int nextInt) {
    }

    public void setCustomers_id(int nextInt) {
    }

    public void getCars_id(int nextInt) {

    }

    public void getCustomers_id(int nextInt) {
    }
}