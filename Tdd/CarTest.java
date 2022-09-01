import mycodes.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testObjectExit(){
        Car newCar = new Car("toyota","2023", 20000);
        assertNotNull(newCar);
    }
    @Test
    public void testThatPriceCanBeSet(){
        Car car = new Car("camry", "2017", 10000);
        car.setPrice(5000);
        assertEquals(5000, car.getPrice());


    }
    @Test
    public void testForDiscountForFirstCar(){
        Car benz = new Car("benz", "2020", 5000);
        double discount= benz.discount(0.05, 5000);

        assertEquals(4997.5, discount);
    }
}