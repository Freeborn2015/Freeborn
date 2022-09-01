package mycodes;

import java.util.Scanner;

    public class WorldPopullationCalculation {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("current world popullation: ");
        long popullation = input.nextLong();;
       long growthRateIsOnePercentOfPopullation = (popullation)/100;
        System.out.printf("growthRateIsOnePercentOfPopullation is: %d%n  ", growthRateIsOnePercentOfPopullation);

        long estimatedGrothAfterYear1 = popullation + growthRateIsOnePercentOfPopullation;
            System.out.printf("estimatedGrowthAfterYear1: %d%n", estimatedGrothAfterYear1);

            long estimatedGrowthRateAfterYear2 = growthRateIsOnePercentOfPopullation + estimatedGrothAfterYear1;
            System.out.printf("estimateGrowthRateAfterYear2 is: %d%n", estimatedGrowthRateAfterYear2);

            long estimatedGrowthAfterYear3 = growthRateIsOnePercentOfPopullation + estimatedGrowthRateAfterYear2;
            System.out.printf("estimatedGrowthRateAfterYear3 is: %d%n", estimatedGrowthAfterYear3);

            long estimatedGrowthAfterYear4 = growthRateIsOnePercentOfPopullation + estimatedGrowthAfterYear3;
            System.out.printf("estimatedGrowthAfterYear4 is: %d%n", estimatedGrowthAfterYear4);

            long estimatedGrowthAfterYear5 = growthRateIsOnePercentOfPopullation + estimatedGrowthAfterYear4;
            System.out.printf("estimatedGrowthAfterYear5 is: %d%n", estimatedGrowthAfterYear5);

        }
}
