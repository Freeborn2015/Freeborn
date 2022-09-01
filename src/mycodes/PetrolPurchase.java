package mycodes;

public class PetrolPurchase {

    private String location;
    private String name;
    private int quantityInLiters;
    private double amount;
   private double princeInLitres;
   private double netAmount;
   private double percentageDiscount;
    public PetrolPurchase(String location, String name, int quantityInLiters, double princeInLitres, double percentageDiscount ){
            this.location = location;
            this.name = name;
            this.quantityInLiters = quantityInLiters;
            this.princeInLitres = princeInLitres;
            this.percentageDiscount = percentageDiscount;
    }

    public PetrolPurchase(){

    }

    public  void setLocation(String location){
        this.location = location;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setQuantityInLiters(int quantityInLiters){
        this.quantityInLiters = quantityInLiters;
    }

    public void setPrinceInLitres(double princeInLitres){
        this.princeInLitres = princeInLitres;
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation(){
        return location;
    }
    public String getName(){
        return name;
    }
    public int getQuantityInLiters(){
        return quantityInLiters;
    }
    public double getPrinceInLitres(){
        return princeInLitres;
    }
    private double discount;

    public double getPercentageDiscount(){
       return (percentageDiscount / 100);
    }
    public double getAmount() {
       return amount = (quantityInLiters * princeInLitres) *  getPercentageDiscount();
    }

    public double getNetAmount(){
        return netAmount = (quantityInLiters * princeInLitres) - getAmount();
    }
}

