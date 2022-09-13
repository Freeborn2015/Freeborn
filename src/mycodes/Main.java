package mycodes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  FairTaxException {

        Scanner scanner = new Scanner(System.in);
        FairTaxCalculation fairTaxCalculation = new FairTaxCalculation();
        System.out.println("number of products");
      int numberOfProducts = scanner.nextInt();

      if(numberOfProducts < 1) throw new FairTaxException("product number can not be" + numberOfProducts);

      for(int index = 1; index <= numberOfProducts; index++){
          System.out.printf("Enter product %d 's name\n", index);
          String productName = scanner.next();

          System.out.printf("Enter price of %s\n", productName);
          double productPrice = scanner.nextDouble();

          Product product = new Product(productName,productPrice);
        fairTaxCalculation.calculateTotalPrice(product.getPrice());
      }
      double grandTotal = fairTaxCalculation.getTotalPrice();
      double tax =  fairTaxCalculation.calculateTax(grandTotal);
        System.out.printf("Pay tax %f now!!", tax);
    }
}
