package mycodes;

public class AccountEx {

    private String firstName;
    private String lastName;
    private double amount;
    private double balance;

    public void setFirstName(String firstName){
    this.firstName = firstName;
}
    public void setLastName(String lastName){
    this.lastName = lastName;
}
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void depositAmount(double depositAmount){
        if(depositAmount > 0){
            balance = balance + depositAmount;
        }
        else System.out.println("you can not deposit a negative amount");
    }

    public void withdrawAmount(double withdrawAmount){
        if(withdrawAmount < balance)
        { balance = balance - withdrawAmount;
        }
        else {
            System.out.println("withdrawal amount exceed balance");
        }

    }

    public double getBalance() {
        return balance;
    }
}
