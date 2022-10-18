package Chapter6;

public class Methods {
    public static void main(String[] args) {
        System.out.println("sum of 1 to 10 is " + sum(1,10));
        System.out.println("sum of 20 to 37 is " + sum(20,37));
        System.out.println("sum of 35 to 49 is " + sum(35,49));

    }
    public static int sum(int i1, int i2){
        int count = 0;
        for(int i = i1; i <= i2; i++)
            count += i;
        return count;
    }

}
