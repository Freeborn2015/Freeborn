public class ARRAY_LENGTH {
    public static void main(String[] args) {

        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        array[0] = 2 + 2 * 0;

        System.out.printf("%s%8s%n", "Index", "Value");

        System.out.printf("%5d%8d%n", 0, array[0]);
        System.out.printf("%5d%8d%n", 1, array[1]);
        System.out.printf("%5d%8d%n", 2, array[2]);
        System.out.printf("%5d%8d%n", 3, array[3]);
        System.out.printf("%5d%8d%n", 4, array[4]);
        System.out.printf("%5d%8d%n", 5, array[5]);
        System.out.printf("%5d%8d%n", 6, array[6]);
        System.out.printf("%5d%8d%n", 7, array[7]);
        System.out.printf("%5d%8d%n", 8, array[8]);
        System.out.printf("%5d%8d%n", 9, array[9]);
        array[1] = 2 + 2 * 1;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++) {
            System.out.printf("%5d%8d%n", count, array[count]);
        }
        array[2] = 2 + 2 * 2;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++) {
            System.out.printf("%5d%8d%n", count, array[count]);
        }
        array[3] = 2 + 2 * 3;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++) {
            System.out.printf("%5d%8d%n", count, array[count]);
        }
        array[4] = 2 + 2 * 4;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++) {
            System.out.printf("%5d%8d%n", count, array[count]);
        }
        array[5] = 2 + 2 * 5;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++) {
            System.out.printf("%5d%8d%n", count, array[count]);
        }
        array[6] = 2 + 2 * 6;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++) {
            System.out.printf("%5d%8d%n", count, array[count]);
        }
        array[7] = 2 + 2 * 7;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++) {
            System.out.printf("%5d%8d%n", count, array[count]);
        }
        array[8] = 2 + 2 * 8;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++) {
            System.out.printf("%5d%8d%n", count, array[count]);
        }
        array[9] = 2 + 2 * 9;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++) {
         System.out.printf("%5d%8d%n", count, array[count]);
        }
         
    }

}
