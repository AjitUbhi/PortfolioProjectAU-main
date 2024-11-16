package components.CarData;
import components.standard.Standard;

/**
 * Contains the kernel methods for the carData Component.
 */
public interface CarDataKernel extends Standard<CarData> {
    /**
     * Sets the make of the car.
     *
     * @param make
     *            the make of the car
     * @ensures the make of {@code this} is {@code make}
     */
    void setMake(String make);

    /**
     * Sets the model of the car.
     *
     * @param model
     *            the model of the car
     * @ensures the model of {@code this} is {@code model}
     */
    void setModel(String model);

    /**
     * Sets the manufacturing year of the car.
     *
     * @param year
     *            the manufacturing year of the car
     * @ensures the year of {@code this} is {@code year}
     */
    void setYear(int year);

    /**
     * Updates or sets the current mileage of the car.
     *
     * @param mileage
     *            the current mileage of the car
     * @ensures the mileage of {@code this} is {@code mileage}
     */
    void updateMileage(int mileage);

    /**
     * Returns the make of the car.
     *
     * @return the make of the car
     *
     * @ensures getMake returns the make of {@code this}
     */
    String getMake();

    /**
     * Returns the model of the car.
     *
     * @return the model of the car
     *
     * @ensures getModel returns the model of {@code this}
     */
    String getModel();

    /**
     * Returns the manufacturing year of the car.
     *
     * @return the manufacturing year of the car
     *
     * @ensures getYear returns the year of {@code this}
     */
    int getYear();

    /**
     * Returns the current mileage of the car.
     *
     * @return the current mileage of the car
     *
     * @ensures getYear returns the year of {@code this}
     */
    int getMileage();
}
