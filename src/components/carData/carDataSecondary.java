package components.carData;

/**
 * Contains the secondary methods for the carData Component.
 */
public abstract class CarDataSecondary implements CarData {

    /**
     * Returns a formatted string containing all details of the car.
     *
     * @return a string with car details
     * @ensures \result.equals("Car Make: " + this.getMake() + ", Model: " +
     *          this.getModel() + ", Year: " + this.getYear() + ", Mileage: " +
     *          this.getMileage())
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
     * @ensures \result == ((2024 - this.getYear()) > 25)
     */
    @Override
    public boolean isVintage() {
        return (2024 - this.getYear()) > 25; // Assuming the current year is 2024
    }

    /**
     * Returns a string representation of the CarData object.
     *
     * @return a string with the details of the car
     * @ensures \result.equals("CarData{make=" + this.getMake() + ", model=" +
     *          this.getModel() + ", year=" + this.getYear() + ", mileage=" +
     *          this.getMileage() + "}")
     */
    @Override
    public String toString() {
        return String.format("CarData{make=%s, model=%s, year=%d, mileage=%d}",
                this.getMake(), this.getModel(), this.getYear(),
                this.getMileage());
    }

    /**
     * Checks if this CarData object is equal to another object.
     *
     * @param obj
     *            the object to compare
     * @return true if the other object is a CarData object with the same make,
     *         model, year, and mileage; false otherwise
     * @ensures \result == (obj != null && obj instanceof CarData && ((CarData)
     *          obj).getMake().equals(this.getMake()) && ((CarData)
     *          obj).getModel().equals(this.getModel()) && ((CarData)
     *          obj).getYear() == this.getYear() && ((CarData) obj).getMileage()
     *          == this.getMileage())
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CarData)) {
            return false;
        }
        CarData other = (CarData) obj;
        return this.getMake().equals(other.getMake())
                && this.getModel().equals(other.getModel())
                && this.getYear() == other.getYear()
                && this.getMileage() == other.getMileage();
    }
}
