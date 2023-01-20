package parkinglot;

import java.util.HashSet;
import java.util.Set;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/20/23
 */
public class ParkingLot {
    private int totalSpots;
    private Set<Car> parkedCars;

    public ParkingLot(int totalSpots) {
        this.totalSpots = totalSpots;
        parkedCars = new HashSet<>();
    }

    public boolean parkCar(Car car) {
        if (parkedCars.size() == totalSpots) {
            return false;
        }
        return parkedCars.add(car);
    }

    public boolean removeCar(Car car) {
        return parkedCars.remove(car);
    }

    public boolean hasSpot() {
        return parkedCars.size() <= totalSpots;
    }
}
