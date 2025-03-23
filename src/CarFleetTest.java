import components.CarData.CarData;
import components.CarData.CarData1;
import components.CarData.CarFleet;
import java.util.List;

/**
 * Test class for the CarFleet component.
 */
public class CarFleetTest {
    public static void main(String[] args) {
        CarFleet fleet = new CarFleet();

        // Create sample cars
        CarData car1 = new CarData1();
        car1.setMake("Toyota");
        car1.setModel("Camry");
        car1.setYear(2015);
        car1.updateMileage(60000);

        CarData car2 = new CarData1();
        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setYear(2018);
        car2.updateMileage(40000);

        CarData car3 = new CarData1();
        car3.setMake("Ford");
        car3.setModel("Mustang");
        car3.setYear(2005);
        car3.updateMileage(120000);

        // Add cars to fleet
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        // Display fleet
        System.out.println("Initial fleet:");
        fleet.displayFleet();

        // Test findCar
        System.out.println("\nFinding a Honda Civic:");
        CarData foundCar = fleet.findCar("Honda", "Civic");
        System.out.println(foundCar != null ? foundCar.getCarDetails() : "Car not found.");

        // Test removeCar
        System.out.println("\nRemoving the second car (Honda Civic)...");
        fleet.removeCar(1);
        fleet.displayFleet();

        // Test getFleet method
        System.out.println("\nListing all cars in fleet:");
        List<CarData> cars = fleet.getFleet();
        for (CarData car : cars) {
            System.out.println(car.getCarDetails());
        }
    }
}
