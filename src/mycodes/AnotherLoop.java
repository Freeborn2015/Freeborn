package mycodes;

import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter length of array: ");
       int books = ac.nextInt();
       int[] textbooks = new int[books];
       int sum = 0;
        System.out.println("Enter numbers of books: ");
        for(int i = 0; i<books;i++){
        textbooks[i] = ac.nextInt();
        sum += textbooks[i];
        }
        int average = sum/books;
        int count =0;
        for(int i=0;i<books;i++)
            if (textbooks[i]>average)
                count++;
        System.out.println("Average: " + average );
        System.out.println("greater than average: " + count);

    }
    }

