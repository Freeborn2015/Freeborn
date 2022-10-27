package chapter10;

public class BMI_Main {
    public static void main(String[] args) {
        BMI bmi = new BMI("Elisha", 18, 145, 70);
        System.out.println("The BMI for " + bmi.getName()+ " is " + bmi.getBMI()+ " " + bmi.getBMI_Status());

        BMI bmi1 = new BMI("jane", 20, 215, 70);
        System.out.println("The BMI for " + bmi1.getName()+ " is " + bmi1.getBMI()+ " "+ bmi1.getBMI_Status());


    }
}