package Chapter6;

public class PrintThreeTimes {


    public static void nPrint(String message, int n) {
        for (int i = 0; i < n; i++) ;
        System.out.println(message);


    }

    public static void main(String[] args) {
        nPrint("hello", 3);
        System.out.println();


    }
}