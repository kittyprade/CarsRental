package CarsRental;

import org.h2.tools.Csv;

import javax.persistence.EntityManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

import static CarsRental.HibernateUtil.sessionFactory;


public class InterfaceCar extends Customers {
    static final EntityManager entityManager = sessionFactory.createEntityManager();
    private static Connection connection;
    public static boolean menuCar() {
        boolean isRunning = true;
        wyswietlMenu();

        Scanner odczyt = new Scanner(System.in);
        String opcja;


        while (isRunning) {
            System.out.print("Podaj opcje: ");
            opcja = odczyt.nextLine();


            switch (opcja) {
                case "klient":

                    Customers customers = new Customers();
                    System.out.println("Podaj imię klienta: ");
                    customers.setFirstName(odczyt.nextLine());
                    System.out.println("Podaj nazwisko klienta: ");
                    customers.setLastName(odczyt.nextLine());
                    System.out.println("Dodano klienta");
                    entityManager.getTransaction().begin();
                    entityManager.persist(customers);
                    entityManager.flush();
                    entityManager.getTransaction().commit();
                    HibernateUtil.shutdown();
                    break;
                case "samochod":
                    Cars cars = new Cars();

                    System.out.print("Podaj markę: ");
                    cars.setCarBrand(odczyt.nextLine());
                    System.out.println("Podaj kolor samochodu: ");
                    cars.setCarColour(odczyt.nextLine());

                    System.out.println("Podaj numer rejestracyjny auta: ");
                    cars.setCarRegistrationNumber(odczyt.nextLine());
                    System.out.println("Podaj model auta: ");
                    cars.setCarModel(odczyt.nextLine());
                    System.out.println("Podaj cene auta");
                    cars.setCarPrice(odczyt.nextBigDecimal());
                    System.out.println("Wpisz 1 - jeśli pojazd jest sprawny" + "\n" + "Wpisz 2 - jeśli pojazd jest uszkodzony");

                    int liczba = odczyt.nextInt();
                    switch (liczba) {
                        case 1:
                            cars.setCarCondition(CarCondition.OPERABLE);
                            break;
                        case 2:
                            cars.setCarCondition(CarCondition.DAMEGED);
                            break;
                        default:
                            System.out.println("Podano złą liczbę");
                    }


                    entityManager.getTransaction().begin();
                    entityManager.persist(cars);
                    entityManager.flush();
                    entityManager.getTransaction().commit();
                    HibernateUtil.shutdown();

                    break;
                case "wypozyczenie":

                    Rental rental = new Rental();
                    System.out.print("Data startu wypożyczenia");
                    rental.setRentalStartData(LocalDate.parse(odczyt.nextLine()));
                    System.out.println("Data zakończenia wypożyczenia");
                    rental.setReturnCarDate(LocalDate.parse(odczyt.nextLine()));
                    System.out.println("Podaj Id auta: ");
                    rental.getCars_id(odczyt.nextInt());
                    System.out.println("Podaj Id klienta");
                    rental.getCustomers_id(odczyt.nextInt());

                    entityManager.getTransaction().begin();
                    entityManager.persist(rental);
                    entityManager.flush();
                    entityManager.getTransaction().commit();
                    HibernateUtil.shutdown();


                    break;
                case "usun":
                    System.out.println("Wybierz 1 - jeśli chcesz usunąć klienta"+"\n"+"Wybierz 2 - jeśli chcesz usunąć samochód");
                    int liczba2 = odczyt.nextInt();
                    switch (liczba2) {
                        case 1:
                            Customers customers1 = new Customers();
                            entityManager.getTransaction().begin();
                            customers1.setCustomers_id(odczyt.nextInt());

                            entityManager.remove(customers1);
                            entityManager.getTransaction().commit();
                            HibernateUtil.shutdown();
                            break;
                        case 2:
                            Cars cars1 = new Cars();
                            entityManager.getTransaction().begin();
                            cars1.setCars_id(odczyt.nextInt());

                            entityManager.remove(cars1);
                            entityManager.getTransaction().commit();
                            HibernateUtil.shutdown();
                            break;
                        default:
                            System.out.println("Podano złą liczbę");
                    }


                    break;
                case "menu":
                    wyswietlMenu();
                    break;
                case "wyjscie":
                    System.out.println("Wyjscie z programu");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Nie rozpoznano opcji.");
                    break;
            }
        }
        return isRunning;
    }




    static void wyswietlMenu() {
        System.out.println("Dodaj Klienta ->klient");
        System.out.println("Dodaj dane wypożyczonego samochodu->samochod ");
        System.out.println("Wypożyczenie samochodu-> wypozyczenie");
        System.out.println("Usuń klienta lub samochód ->usun");
        System.out.println("Wyświetl menu -> menu");
        System.out.println("Wyjście z programu -> wyjscie");
    }

}
