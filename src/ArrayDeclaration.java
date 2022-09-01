public class ArrayDeclaration {
    public static void main(String[] args) {
        int [] elements = new int[10];
        System.out.printf("%s%8s%n","index","value");
        for(int counter = 0; counter<elements.length;counter++){
            System.out.printf("%5d%8d%n", counter,elements[counter]);
        }

    }


}
