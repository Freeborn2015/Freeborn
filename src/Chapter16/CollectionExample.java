package Chapter16;

import java.util.Arrays;

public class CollectionExample {
    public static void main(String[] args) {
        Integer [] numbers = {1,2,3,4,5,6};
        printNumbers(numbers);
    }
    public static  void printNumbers(Integer... nums){
        System.out.println(Arrays.toString(nums));
    }
}
