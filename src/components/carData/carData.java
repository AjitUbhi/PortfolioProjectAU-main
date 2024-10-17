package components.carData;

/**
 * Represents a car and manages its information including make, model, year, and
 * mileage.
 */
public class carData implements carDataKernel, carDataSecondary {
    private String make;
    private String model;
    private int year;
    private int mileage;

    /**
     * Sets the make of the car.
     *
     * @param make
     *            the make of the car
     */
    @Override
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Sets the model of the car.
     *
     * @param model
     *            the model of the car
     */
    @Override
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Sets the manufacturing year of the car.
     *
     * @param year
     *            the manufacturing year of the car
     */
    @Override
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Updates or sets the current mileage of the car.
     *
     * @param mileage
     *            the current mileage of the car
     */
    @Override
    public void updateMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * Returns the make of the car.
     *
     * @return the make of the car
     */
    @Override
    public String getMake() {
        return this.make;
    }

    /**
     * Returns the model of the car.
     *
     * @return the model of the car
     */
    @Override
    public String getModel() {
        return this.model;
    }

    /**
     * Returns the manufacturing year of the car.
     *
     * @return the manufacturing year of the car
     */
    @Override
    public int getYear() {
        return this.year;
    }

    /**
     * Returns the current mileage of the car.
     *
     * @return the current mileage of the car
     */
    @Override
    public int getMileage() {
        return this.mileage;
    }

    /**
     * Returns a formatted string containing all details of the car.
     *
     * @return a string with car details
     */
    @Override
    public String getCarDetails() {
        return String.format("Car Make: %s, Model: %s, Year: %d, Mileage: %d",
                this.make, this.model, this.year, this.mileage);
    }

    /**
     * Checks if the car is considered vintage. A car is considered vintage if
     * it is older than 25 years.
     *
     * @return true if the car is vintage; false otherwise
     */
    @Override
    public boolean isVintage() {
        return (2024 - this.year) > 25; // Assuming the current year is 2024
    }
}
