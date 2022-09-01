package mycodes;

import java.util.Scanner;
    public class DigitApplicatioon {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your five digits: ");
            int number = input.nextInt();

            System.out.println("");
            int a = number / 10000 % 10;
            int b = number / 1000 % 10;
            int c  = number /100 %10;
            int d = number/ 10 % 10;
            int e = number % 10;

            System.out.println(a +" "+ b+" " + c+" " + d+" " + e);
        }
// to space numbers


}
