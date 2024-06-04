import java.util.ArrayList;
import java.util.List;

public class CarUtils {
    public static void main(String[] args) {
        Car first = new Car();
        Car second = new Car();
        Car third = new Car();

        List<Car> myCars = new ArrayList<>();
        myCars.add(first);
        myCars.add(second);
        myCars.add(third);

        myCars.forEach(Car::getCabinWidth);

    }

    private void getCabinWidth(Car car) {
        car.getCabinWidth();
    }
}
