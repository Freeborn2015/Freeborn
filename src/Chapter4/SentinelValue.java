package Chapter4;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number(or enter 0 to quit): ");
        int data = scanner.nextInt();

        int sum = 0;
        while (data != 0){
            sum += data;
            System.out.println("Enter a number(or enter 0 to quit): ");
            data = scanner.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
