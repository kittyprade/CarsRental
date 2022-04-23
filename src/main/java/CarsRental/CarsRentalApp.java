package CarsRental;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CarsRentalApp extends InterfaceCar {



    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession(); // otweranie sesji czyli połączenia z bazą danych
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final EntityManager entityManager = sessionFactory.createEntityManager();

        System.out.println(menuCar());

//
//         Customers customers = new Customers();
//         Customers customers2 = new Customers();
//         Customers customers3 = new Customers();
//         Customers customers4 = new Customers();
//
//
//
//
//         customers.setFirstName("Jan");
//         customers.setLastName("Kowalski");
//
//         customers2.setFirstName("Franek");
//         customers2.setLastName("Wiosna");
//
//         customers3.setFirstName("Agnieszka");
//         customers3.setLastName("Rambo");
//
//         customers4.setLastName("Mucha");
//         customers4.setFirstName("Jagna");
//
//
//        Cars cars = new Cars();
//        cars.setCarBrand("Volkswagen");
//        cars.setCarColour("White");
//        cars.setCarModel("Passat");
//        cars.setCarRegistrationNumber("GA7777");
//        cars.setCarCondition(CarCondition.OPERABLE);
//        cars.setCarPrice(BigDecimal.valueOf(120000));
//
//        Rental rental = new Rental();
//        rental.setCars_id();
//        rental.setRentalStartData(LocalDate.parse("2021-10-10"));
//        rental.setReturnCarDate(LocalDate.parse("2021-10-21"));

//        entityManager.getTransaction().begin();
//
////        entityManager.persist(rental);
////        entityManager.persist(customers2);
////        entityManager.persist(customers3);
////        entityManager.persist(customers4);
//        entityManager.flush();
//
//        entityManager.getTransaction().commit();
//
//
//
//        HibernateUtil.shutdown();





    }
}