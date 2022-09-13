package mycodes;

public class FairTaxCalculation {
    private final double FAIR_TAX_RATE = 23.00;
    private  double totalPrice = 0.0;

    public double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public double calculateTax(double price) {
        return (FAIR_TAX_RATE/100) * price;
    }

    public double calculateTotalPrice(double price) {

          totalPrice += price;
          return totalPrice;
    }



}
