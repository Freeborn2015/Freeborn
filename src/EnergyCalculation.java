import java.util.Scanner;

public class EnergyCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of heat in kilogram: ");
        double m = input.nextDouble();

        System.out.println("Enter initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double  q = m * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is: " + q);
    }

}
