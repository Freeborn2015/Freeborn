package Chapter6;

import java.util.Scanner;

public class MethodPassing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + gcd(num1,num2));

    }
    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int k = 2;
        while (k <= num1 && k <= num1) {
            if (num1 % k == 0 && num2 % k == 0)
                gcd = k;
            k++;


        }
        return gcd;
    }
}
