package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example {
    public static void main(String[] args) {
        Integer[] array = {9, 7, 1, 3, 5, 4, 8, 9, 10, 12, 20, 25};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
