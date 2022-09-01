package mycodes;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car("honda","2020", 1000);
        System.out.printf("Car model: %s%n ", car.getModel());

        System.out.println("Enter the cost of the car");
        double carPrice = scanner.nextDouble();

        System.out.println("Enter The Discount Percentage");
        double priceDiscount = scanner.nextDouble();

       double customerAmount = car.discount(priceDiscount, carPrice);



        System.out.printf("Your are to pay %.2f%n", customerAmount);

    }
}
