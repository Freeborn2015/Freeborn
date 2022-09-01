import java.util.Scanner;

public class PoundsToKilogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilogram = 0.454;

        double  result =  pounds * kilogram;
        System.out.println("The result is: " + result);

    }
}
