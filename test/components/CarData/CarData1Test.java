package components.CarData;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


class CarData1Test {

    @Test
    void testSetAndGetMake() {
        CarData1 car = new CarData1();
        car.setMake("Toyota");
        assertEquals("Toyota", car.getMake());
    }

    @Test
    void testSetAndGetModel() {
        CarData1 car = new CarData1();
        car.setModel("Corolla");
        assertEquals("Corolla", car.getModel());
    }

    @Test
    void testSetAndGetYear() {
        CarData1 car = new CarData1();
        car.setYear(2010);
        assertEquals(2010, car.getYear());
    }

    @Test
    void testSetAndGetMileage() {
        CarData1 car = new CarData1();
        car.updateMileage(50000);
        assertEquals(50000, car.getMileage());
    }

    @org.junit.Test
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
