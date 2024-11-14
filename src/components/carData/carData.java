package components.carData;

/**
 * Represents a car and manages its information including make, model, year, and
 * mileage.
 */
public interface CarData extends CarDataKernel {

    /**
     * Returns a formatted string containing all details of the car.
     *
     * @return a string with car details
     *
     * @ensures getMake returns the make, model, year, and mileage of
     *          {@code this}
     */
    String getCarDetails();

    /**
     * Checks if the car is considered vintage. A car is considered vintage if
     * it is older than 25 years.
     *
     * @return true if the car is vintage; false otherwise
     *
     * @ensures isVintage checks if the {@code this} has a year that is at least
     *          25 years ago
     */
    boolean isVintage();
}
