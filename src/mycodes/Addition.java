package mycodes;
    import java.util.Scanner;

    // program uses class Scanner
    public class Addition {
        // CarMain method begins execution of java application
        public static void main(String[] args) {
// create a Scanner to obtain input from the Scanner window
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first integer: "); // prompt
            int number1 = input.nextInt(); // read first number from user
            System.out.print("Enter second integer: "); // prompt
            int number2 = input.nextInt(); // read second number from user
            int sum = number1 + number2; // add numbers, then store total in sum
            System.out.printf("Sum is %d%n", sum); // display sum
        }
    }

