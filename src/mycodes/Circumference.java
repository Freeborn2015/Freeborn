package mycodes;

import java.util.Scanner;

public class Circumference {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of a circle: ");
      int radius = input.nextInt();
      
      int diameter =  2 *radius;
        System.out.printf("diameter is: %d%n", diameter);

        double area = (22*radius*radius)/7;
        System.out.printf("area is: %d%n", area);


    }
}
