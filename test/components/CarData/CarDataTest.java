package components.CarData;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Tests the secondary methods of the CarData component.
 * Verifies the methods getCarDetails, isVintage, toString, and equals function correctly.
 */
class CarDataSecondaryTest {
    /**
     * Tests the getCarDetails method to ensure it returns a correctly formatted string
     * containing all car details.
     */
    @Test
    void testGetCarDetails() {
        CarData1 car = new CarData1();
        car.setMake("Honda");
        car.setModel("Civic");
        car.setYear(2015);
        car.updateMileage(30000);
        assertEquals("Car Make: Honda, Model: Civic, Year: 2015, Mileage: 30000", car.getCarDetails());
    }
    /**
     * Tests the isVintage method to ensure it correctly determines if a car is vintage
     * based on its year.
     */
    @Test
    void testIsVintage() {
        CarData1 car = new CarData1();
        car.setYear(1995);
        assertEquals(car.isVintage(), true);

        car.setYear(2010);
        assertEquals(car.isVintage(), false);
    }
    /**
     * Tests the toString method to ensure it returns a correctly formatted string
     * representation of the car's details.
     */
    @Test
    void testToString() {
        CarData1 car = new CarData1();
        car.setMake("Tesla");
        car.setModel("Model S");
        car.setYear(2020);
        car.updateMileage(15000);
        assertEquals("CarData{make=Tesla, model=Model S, year=2020, mileage=15000}", car.toString());
    }
    /**
     * Tests the equals method to ensure it correctly determines equality between two
     * CarData objects based on their properties.
     */
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

        assertTrue(car1.equals(car2));

        car2.setYear(2015);
        assertFalse(car1.equals(car2));
    }
}
