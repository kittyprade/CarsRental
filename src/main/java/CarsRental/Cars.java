package CarsRental;


import javax.persistence.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CARS")
public class Cars {

    // tworzy wpierwszą kolumnę id to oznacza  autoinkrementację = strategy = GenerationType.IDENTITY

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer cars_id;

    @Column(name="car_brand")
    private String carBrand;

    @Column(name="car_model")
    private String carModel;

    @Column(name="car_colour")
    private String carColour;

    @Column(name="car_registration_number")
    private String carRegistrationNumber;

    @Column(name="car_condition")
    @Enumerated(EnumType.STRING)
    private CarCondition carCondition;

    @Column(name="car_price")
    private BigDecimal carPrice;



    public Cars()   {

    }

    public Integer getCars_id() {
        return cars_id;
    }

    public void setCars_id(Integer cars_id) {
        this.cars_id = cars_id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public void setCarRegistrationNumber(String carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;
    }

    public CarCondition getCarCondition() {
        return carCondition;
    }

    public void setCarCondition(CarCondition carCondition) {
        this.carCondition = carCondition;
    }

    public BigDecimal getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(BigDecimal carPrice) {
        this.carPrice = carPrice;
    }
}