package components.carData;

/**
 * Demonstrates the functionality of the CarData component. This class contains
 * the main method that creates a CarData object, sets its properties, and
 * displays its details.
 */
public class CarData1L extends CarDataSecondary {
    /**
     * Make of car.
     */
    private String make;
    /**
     * Model of car.
     */
    private String model;
    /**
     * Year of car.
     */
    private int year;
    /**
     * Mileage of car.
     */
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
     * Creator of initial representation.
     *
     * @param make
     *            the make of the car
     * @param model
     *            the model of the car
     * @param year
     *            the manufacturing year of the car
     * @param mileage
     *            the current mileage of the car
     */
    private void createNewRep(String make, String model, int year,
            int mileage) {
        this.make = make;
        this.model = model;

        this.year = year;
        this.mileage = mileage;
    }

    /**
     * No-argument constructor.
     */
    public CarData1L() {
        this.createNewRep("", "", 0, 0);
    }

    @Override
    public final CarData newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public void transferFrom(CarData arg0){
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof CarData1L<?> : ""
                + "Violation of: source is of dynamic type CarData1L";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case: source must be of dynamic type Set3a<?>, and
         * the ? must be T or the call would not have compiled.
         */
        CarData1L localSource = (CaraData1L) source;
        this.car = localSource.car;
        localSource.createNewRep("", "", 0, 0);
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

}
