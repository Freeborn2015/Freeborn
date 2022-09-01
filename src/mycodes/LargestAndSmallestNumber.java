package mycodes;

import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1 = input.nextInt();
        System.out.println("enter second number: ");
        int num2 = input.nextInt();

        System.out.println("enter third number: ");
        int num3 = input.nextInt();

        //sum of inputs
        int sum = num1 + num2 + num3;
        System.out.printf("sum is: %d%n", sum);

        //multiplication of inputs
        int product = num1 * num2 * num3;
        System.out.printf("product is: %d%n", product);

        //average
        int average = (num1 + num2 + num3)/3;
        System.out.printf("average is: %d%n", average);

        //division of sum
        int division = sum/3;
        System.out.printf("division is: %d%n", division);

        //for highest number
        System.out.println("highest number is: " + Math.max(num1, Math.max(num2, num3)));

        //for lowest number
        System.out.println("smallest number is: " + Math.min(num1, Math.max(num2, num3)));
    }
}
