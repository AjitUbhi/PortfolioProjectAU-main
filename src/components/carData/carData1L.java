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
     * @ensures this.getMake() == make
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
     * @ensures this.getModel() == model
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
     * @ensures this.getYear() == year
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
     * @ensures this.getMileage() == mileage
     */
    @Override
    public void updateMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * Returns the make of the car.
     *
     * @return the make of the car
     * @ensures \result == this.make
     */
    @Override
    public String getMake() {
        return this.make;
    }

    /**
     * Returns the model of the car.
     *
     * @return the model of the car
     * @ensures \result == this.model
     */
    @Override
    public String getModel() {
        return this.model;
    }

    /**
     * Returns the manufacturing year of the car.
     *
     * @return the manufacturing year of the car
     * @ensures \result == this.year
     */
    @Override
    public int getYear() {
        return this.year;
    }

    /**
     * Returns the current mileage of the car.
     *
     * @return the current mileage of the car
     * @ensures \result == this.mileage
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
     * @ensures this.getMake() == make && this.getModel() == model &&
     *          this.getYear() == year && this.getMileage() == mileage
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
     *
     * @ensures this.getMake().equals("") && this.getModel().equals("") &&
     *          this.getYear() == 0 && this.getMileage() == 0
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

    /**
     * Transfers data from the specified CarData object to this object, then
     * clears the specified object.
     *
     * @param arg0
     *            the source CarData object to transfer from
     * @ensures this.getMake() == arg0.getMake() && this.getModel() ==
     *          arg0.getModel() && this.getYear() == arg0.getYear() &&
     *          this.getMileage() == arg0.getMileage() &&
     *          arg0.getMake().equals("") && arg0.getModel().equals("") &&
     *          arg0.getYear() == 0 && arg0.getMileage() == 0
     */
    @Override
    public void transferFrom(CarData arg0) {
        assert arg0 != null : "Violation of: source is not null";
        assert arg0 != this : "Violation of: source is not this";
        assert arg0 instanceof CarData1L : ""
                + "Violation of: source is of dynamic type CarData1L";
        // Cast arg0 to CarData1L and perform the transfer
        CarData1L localSource = (CarData1L) arg0;
        this.make = localSource.make;
        this.model = localSource.model;
        this.year = localSource.year;
        this.mileage = localSource.mileage;

        // Clear the source
        localSource.clear();
    }

    /**
     * Clears all data of this CarData object, setting it to default values.
     *
     * @ensures this.getMake().equals("") && this.getModel().equals("") &&
     *          this.getYear() == 0 && this.getMileage() == 0
     */
    @Override
    public void clear() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.mileage = 0;
    }

}
