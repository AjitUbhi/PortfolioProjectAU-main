package components.CarData;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages a fleet of cars, allowing adding, removing, and modifying cars.
 */
public class CarFleet {
    private List<CarData> fleet;

    /**
     * Constructs an empty fleet of cars.
     */
    public CarFleet() {
        this.fleet = new ArrayList<>();
    }

    /**
     * Adds a car to the fleet.
     *
     * @param car
     *            the car to add
     */
    public void addCar(CarData car) {
        this.fleet.add(car);
    }

    /**
     * Removes a car from the fleet by its index.
     *
     * @param index
     *            the index of the car to remove
     * @return the removed car, or null if the index is invalid
     */
    public CarData removeCar(int index) {
        if (index >= 0 && index < this.fleet.size()) {
            return this.fleet.remove(index);
        }
        return null;
    }

    /**
     * Finds a car in the fleet by make and model.
     *
     * @param make
     *            the make of the car
     * @param model
     *            the model of the car
     * @return the found car or null if not found
     */
    public CarData findCar(String make, String model) {
        for (CarData car : this.fleet) {
            if (car.getMake().equalsIgnoreCase(make)
                    && car.getModel().equalsIgnoreCase(model)) {
                return car;
            }
        }
        return null;
    }

    /**
     * Returns the list of all cars in the fleet.
     *
     * @return a list of all cars
     */
    public List<CarData> getFleet() {
        return new ArrayList<>(this.fleet);
    }

    /**
     * Displays all cars in the fleet.
     */
    public void displayFleet() {
        if (this.fleet.isEmpty()) {
            System.out.println("No cars in the fleet.");
        } else {
            for (int i = 0; i < this.fleet.size(); i++) {
                System.out.println(
                        (i + 1) + ". " + this.fleet.get(i).getCarDetails());
            }
        }
    }
}
