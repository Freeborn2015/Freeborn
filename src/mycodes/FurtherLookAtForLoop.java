package mycodes;

import java.util.Scanner;

public class FurtherLookAtForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of elements: ");
       int c = input.nextInt();
       int[] number = new int[c];
       int sum = 0;
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < c; i++ ){
            number[i] = input.nextInt();
            sum+= number[i];
        }
        int average = sum/c;
        //for numbers above average
       int count = 0;
       for(int i = 0; i < c; i++)
           if(number[i] > average)
               count++;
        System.out.println("average is: " + average);
        System.out.println("numbers greater than average is: " + count);

    }
}
