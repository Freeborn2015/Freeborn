import java.util.Arrays;

public class ArrayMax {

    public static void main(String[] args) {
            int array[] = {2,3,1,5,8,3};
            int size = array.length;
            Arrays.sort(array);
            System.out.println("sorted Array ::" + Arrays.toString(array));
            int res = array[size-1];
            System.out.println("largest element is ::" + res);
        }

    }