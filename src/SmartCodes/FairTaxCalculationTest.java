package SmartCodes;

import SmartCodes.FairTaxCalculation;
import mycodes.Product;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FairTaxCalculationTest {
    private FairTaxCalculation fairTaxCalculation;

    @BeforeEach
    void setup(){
        fairTaxCalculation = new FairTaxCalculation();
    }

    @Test
    public void testThatFairTaxCanBeCalculated(){
        //given
        Product product = new Product("milo", 100.00);
        //when
        double tax = fairTaxCalculation.calculateTax(product.getPrice());
        //assert
        Assertions.assertEquals(23.00, tax);

    }
    @Test
    void testThatProductsTotalPriceCanBeCalculated(){
        //given
        fairTaxCalculation.setTotalPrice(50.00);
        //when
        double totalPrice = fairTaxCalculation.calculateTotalPrice(100.00);
        //assert
        Assertions.assertEquals(150, totalPrice);


    }


}