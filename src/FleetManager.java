import components.CarData.CarData;
import components.CarData.CarData1;

import java.util.ArrayList;
import java.util.List;

public final class FleetManager {
    public static void main(String[] args) {
        List<CarData> fleet = new ArrayList<>();

        CarData1 car1 = new CarData1();
        car1.setMake("Toyota");
        car1.setModel("Camry");
        car1.setYear(2018);
        car1.updateMileage(25000);
        fleet.add(car1);

        CarData1 car2 = new CarData1();
        car2.setMake("Ford");
        car2.setModel("Fusion");
        car2.setYear(2015);
        car2.updateMileage(75000);
        fleet.add(car2);

        for (CarData car : fleet) {
            System.out.println(car.getCarDetails());
            System.out.println("Is vintage: " + car.isVintage());
        }
    }
}
