package Chapter4;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number from 0 to 100");

        int guess = -1;
        while ((guess != number)){
            System.out.println("\nEnter your guess: ");
            guess = scanner.nextInt();
            if(guess == number){
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("number is too high");

            }
            else {
                System.out.println("your guess is too low");

                }
        }


    }
}
