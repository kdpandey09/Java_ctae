/*Java program for copy constructor (Kaustub Dutt Pandey)*/
public class Car {
    private Double price;
    private String name;

    // constructor to initialize Price and name of Cars
    Car(Double Price, String Name) {
        price = Price;
        name = Name;
    }

    // creating a copy constructor
    Car(Car car) {
        System.out.println("\nCopy Constructor Invoked \n");
        price = car.price;
        name = car.name;
    }

    // creating a method that returns the price of the Car
    Double showPrice() {
        return price;
    }

    // creating a method that returns the name of the Car
    String showName() {
        return name;
    }

    public static void main(String args[]) {
        Car car1 = new Car(3.29, "aston martin db11");
        System.out.println("Name of the first Car: " + car1.showName());
        System.out.println("Price of the first Car (in Crores) :RS." + car1.showPrice());
        // passing the parameters to the copy constructor
        Car car2 = new Car(car1);
        System.out.println("Name of the second Car: " + car2.showName());
        System.out.println("Price of the second Car (in Crores) :Rs." + car2.showPrice());
    }

}