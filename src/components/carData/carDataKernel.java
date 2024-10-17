package components.carData;

/**
 * Contains the kernel methods for the carData Component.
 */
public interface carDataKernel {
    /**
     * Set the make of the car.
     *
     * @param make
     *            The manufacturer of the car
     */
    void setMake(String make);

    /**
     * Set the model of the car.
     *
     * @param model
     *            The specific car made
     */
    void setModel(String model);

    /**
     * Set the year of the car.
     *
     * @param year
     *            The year the car was produced
     */
    void setYear(int year);

    /**
     * Set or change the milage of the car.
     *
     * @param mileage
     *            The amount the car has been driven
     */
    void updateMileage(int mileage);

    /**
     * @return returns the make of the car.
     */
    String getMake();

    /**
     * @return returns the model of the car.
     */
    String getModel();

    /**
     * @return returns the year of the car.\
     */
    int getYear();

    /**
     * @return returns the mileage of the car.
     */
    int getMileage();
}
