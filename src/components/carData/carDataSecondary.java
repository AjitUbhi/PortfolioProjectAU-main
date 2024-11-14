package components.carData;

/**
 * Contains the secondary methods for the carData Component.
 */
public abstract class CarDataSecondary implements CarData {

    /**
     * Returns a formatted string containing all details of the car.
     *
     * @return a string with car details
     */
    @Override
    public String getCarDetails() {
        return String.format("Car Make: %s, Model: %s, Year: %d, Mileage: %d",
                this.getMake(), this.getModel(), this.getYear(),
                this.getMileage());
    }

    /**
     * Checks if the car is considered vintage. A car is considered vintage if
     * it is older than 25 years.
     *
     * @return true if the car is vintage; false otherwise
     */
    @Override
    public boolean isVintage() {
        return (2024 - this.getYear()) > 25; // Assuming the current year is 2024
    }
}
