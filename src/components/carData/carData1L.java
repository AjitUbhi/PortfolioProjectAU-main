package components.carData;

/**
 * Demonstrates the functionality of the CarData component. This class contains
 * the main method that creates a CarData object, sets its properties, and
 * displays its details.
 */
public class carData1L {
    /**
     * The main method to demonstrate the CarData functionality.
     *
     * @param args
     *            command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a new CarData object
        carData myCar = new carData();

        // Set properties of the car
        myCar.setMake("Ford");
        myCar.setModel("Mustang");
        myCar.setYear(1969);
        myCar.updateMileage(120000);

        // Display car details
        System.out.println(myCar.getCarDetails());

        // Check if the car is vintage
        if (myCar.isVintage()) {
            System.out.println("This car is considered vintage.");
        } else {
            System.out.println("This car is not vintage.");
        }
    }
}
