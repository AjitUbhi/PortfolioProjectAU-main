package components.carData;
/**
 * Contains the secondary methods for the carData Component.
 */
public interface carDataSecondary {
    /**
     * Provides the details of the car such as year,make and model.
     *
     * @return Provides details on car
     */
    String getCarDetails();

    /**
     * Determines if the car is vintage based on age >= 25.
     *
     * @return boolean value
     */
    boolean isVintage();
}
