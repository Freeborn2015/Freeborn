import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorTest {

    @Test
        public void testForFactorsOfNumber(){
        Factor number = new Factor();
        assertEquals(4, number.factors(6));
        }
    @Test
    public void testForFactorsOfNumbers(){
    Factor factor = new Factor();

        assertEquals(6, factor.factors(20));



        }
}