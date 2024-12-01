package components.CarData;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

class CarDataSecondaryTest {

    @Test
    void testGetCarDetails() {
        CarData1 car = new CarData1(); // Use the concrete implementation
        car.setMake("Honda");
        car.setModel("Civic");
        car.setYear(2015);
        car.updateMileage(30000);
        assertEquals("Car Make: Honda, Model: Civic, Year: 2015, Mileage: 30000", car.getCarDetails());
    }

    @Test
    void testIsVintage() {
        CarData1 car = new CarData1(); // Use the concrete implementation
        car.setYear(1995);
        assertEquals(car.isVintage(), true);

        car.setYear(2010);
        assertEquals(car.isVintage(), false);
    }

    @Test
    void testToString() {
        CarData1 car = new CarData1(); // Use the concrete implementation
        car.setMake("Tesla");
        car.setModel("Model S");
        car.setYear(2020);
        car.updateMileage(15000);
        assertEquals("CarData{make=Tesla, model=Model S, year=2020, mileage=15000}", car.toString());
    }

    @Test
    void testEquals() {
        CarData1 car1 = new CarData1();
        car1.setMake("Chevrolet");
        car1.setModel("Malibu");
        car1.setYear(2018);
        car1.updateMileage(20000);

        CarData1 car2 = new CarData1();
        car2.setMake("Chevrolet");
        car2.setModel("Malibu");
        car2.setYear(2018);
        car2.updateMileage(20000);

        assertEquals(car1, car2);

        car2.setYear(2015);
        assertEquals(car1, car2);
    }
}
