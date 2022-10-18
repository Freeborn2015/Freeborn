package Chapter4;

import java.util.Scanner;

public class RandomMathQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner scanner = new Scanner(System.in);

        System.out.print("what is " + number1 + "+" + number2 + "?");
        int result = scanner.nextInt();

        while (number1 + number2 != result){
            System.out.println("Wrong answer. try again. What is"
                    + number1 + "+" + number2 + "?");

            result = scanner.nextInt();
        }
        System.out.println("you got it");
    }
}
