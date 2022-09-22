package Chapter7;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] element = {{1,2},{3,4},{5,6}};
        int sum = 0;
        for(int i = 0; i < element.length; i++){
            for(int j= 0; j <element[i].length; j++){
                sum += element[i][0];
                System.out.println(sum);
            }
        }
    }
}
