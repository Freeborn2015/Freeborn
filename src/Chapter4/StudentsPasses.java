package Chapter4;

import java.util.Scanner;

public class StudentsPasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.println("Enter result(pass 1, fail 2): ");
            int result = scanner.nextInt();
            if(result == 1){
                pass ++;
            }
            else {
                fail ++;
            }
            studentCounter ++;

        }
        System.out.printf("pass: %d%n fail: %d%n", pass, fail);
        if(pass >= 7){
            System.out.println("Bonus to instructor");
        }
    }

}