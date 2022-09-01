package mycodes;

import java.util.Scanner;

public class PetrolStation {
    public static void main(String[] args) {
        int liters;
        double price;
        int discount;
        Scanner sc = new Scanner(System.in);
        PetrolPurchase freeBorn = new PetrolPurchase();

        System.out.println("How many Litres of Fuel: ");
        freeBorn.setQuantityInLiters(liters = sc.nextInt());

        System.out.println("How Much Per Litre");
        freeBorn.setPrinceInLitres(price = sc.nextDouble());

        System.out.println("How much discount: ");
        freeBorn.setPercentageDiscount(discount = sc.nextInt());

        System.out.println("The total Price is " + freeBorn.getNetAmount());
    }
}
