package components.carData;

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
     */
    void setMake(String make);

    /**
     * Sets the model of the car.
     *
     * @param model
     *            the model of the car
     */
    void setModel(String model);

    /**
     * Sets the manufacturing year of the car.
     *
     * @param year
     *            the manufacturing year of the car
     */
    void setYear(int year);

    /**
     * Updates or sets the current mileage of the car.
     *
     * @param mileage
     *            the current mileage of the car
     */
    void updateMileage(int mileage);

    /**
     * Returns the make of the car.
     *
     * @return the make of the car
     */
    String getMake();

    /**
     * Returns the model of the car.
     *
     * @return the model of the car
     */
    String getModel();

    /**
     * Returns the manufacturing year of the car.
     *
     * @return the manufacturing year of the car
     */
    int getYear();

    /**
     * Returns the current mileage of the car.
     *
     * @return the current mileage of the car
     */
    int getMileage();
}
