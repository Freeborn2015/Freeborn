package mycodes;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weightInPounds  = input.nextDouble();

        System.out.println("Enter your height in inches: ");
        double heightInInches = input.nextDouble();

        double bodyMassIndex = (weightInPounds *703) / (heightInInches * heightInInches);

        System.out.printf("bodyMassIndex is %.2f%n", bodyMassIndex);



    }
}
