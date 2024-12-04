package components.CarData;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *  Tests the kernel methods of the CarData component implemented in the
 * CarData1 class.
 * Verifies the functionality of core methods such as setters, getters, and clear.
 */
class CarData1Test {

    /**
     * Tests the setMake and getMake methods to ensure the car's make is correctly set and retrieved.
     */
    @Test
    void testSetAndGetMake() {
        CarData1 car = new CarData1();
        car.setMake("Toyota");
        assertEquals("Toyota", car.getMake());
    }

    /**
     * Tests the setModel and getModel methods to ensure the car's model is correctly set and retrieved.
     */
    @Test
    void testSetAndGetModel() {
        CarData1 car = new CarData1();
        car.setModel("Corolla");
        assertEquals("Corolla", car.getModel());
    }

    /**
     * Tests the setYear and getYear methods to ensure the car's year is correctly set and retrieved.
     */
    @Test
    void testSetAndGetYear() {
        CarData1 car = new CarData1();
        car.setYear(2010);
        assertEquals(2010, car.getYear());
    }

    /**
     * Tests the updateMileage and getMileage methods to ensure the car's mileage is correctly updated and retrieved.
     */
    @Test
    void testSetAndGetMileage() {
        CarData1 car = new CarData1();
        car.updateMileage(50000);
        assertEquals(50000, car.getMileage());
    }

    /**
     * Tests the clear method to ensure all car details are reset to default values.
     */
    @Test
    void testClear() {
        CarData1 car = new CarData1();
        car.setMake("Ford");
        car.setModel("Focus");
        car.setYear(2012);
        car.updateMileage(60000);
        car.clear();
        assertEquals("", car.getMake());
        assertEquals("", car.getModel());
        assertEquals(0, car.getYear());
        assertEquals(0, car.getMileage());
    }
}
