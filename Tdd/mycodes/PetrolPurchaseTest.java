package mycodes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {

    private PetrolPurchase freeBorn;
    @BeforeEach
    public void setUpBeforeEachTest(){
        freeBorn = new PetrolPurchase("Yaba", "FreeBorn Gas" , 60 , 350 , 15);
    }

    @Test
    public void testThatPetrolStationexist(){
        //given that petrol station exist
        assertNotNull(freeBorn);
    }
    @Test
    public void testThatWeCanBuyFuel(){
        //given that petrol station exist
        //check that i can buy fuel
        freeBorn.setQuantityInLiters(50);
        freeBorn.setPrinceInLitres(5);
        assertEquals(250, freeBorn.getAmount());

    }

    @Test
    public void testThatCustomerCanBuyFuelAndGetDiscount(){
        //given that customer has money,
        //check he or she can buy fuel and get discount
        freeBorn.setQuantityInLiters(50);
        freeBorn.setPrinceInLitres(10);
        freeBorn.setPercentageDiscount(2);
        assertEquals(490, freeBorn.getNetAmount());
    }
}
