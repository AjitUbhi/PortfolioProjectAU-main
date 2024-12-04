import components.CarData.CarData1;
/**
 * Demonstrates the usage of the CarData component to check if a car qualifies as vintage.
 * This class creates a car with specific details and determines if it is vintage.
 *
 * @author Ajit Ubhi
 */
public final class VintageCarCheck {
    /**
     * Creates a car and shows the use for the isVintage method.
     * @param args
     *             command-line arguments (not used)
     */
    public static void main(String[] args) {
        CarData1 classicCar = new CarData1();
        classicCar.setMake("Chevrolet");
        classicCar.setModel("Bel Air");
        classicCar.setYear(1960);
        classicCar.updateMileage(120000);

        if (classicCar.isVintage()) {
            System.out.println("This car qualifies for the vintage car club:");
            System.out.println(classicCar.getCarDetails());
        } else {
            System.out.println("This car is not vintage.");
        }
    }
}
