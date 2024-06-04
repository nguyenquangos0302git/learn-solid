import java.util.ArrayList;
import java.util.List;

public class VehicleUtils {

    public static void main(String[] args) {
        Vehicle first = new Vehicle();
        Vehicle second = new Vehicle();
        Vehicle third = new Vehicle();

        List<Vehicle> myCars = new ArrayList<>();
        myCars.add(first);
        myCars.add(second);
        myCars.add(third);

        myCars.forEach(VehicleUtils::getInterior);

    }

    private static void getInterior(Vehicle car) {
        car.getInterior();
    }

}
