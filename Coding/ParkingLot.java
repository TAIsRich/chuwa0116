

public class ParkingLot {
	private List<Level> levels;

	public List<Integer> getAvailableCountForLevels() {
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < levels.length; ++i) {
			res.append(levels.get(i).getAvailableCount());
		}
		return res;
	}

	private List<Spot> findSpotsForVehicle(Vehicle v) throws NoAvailableSpotException {
		int size = v.getSize();
		for (Level level: levels) {
			List<Spot> levelSpots = level.getSpots();
			for (int i = 0; i + size < levelSpots.length; ++i) {
				boolean valid = true;
				for (int j = 0; j < size && valid; ++j) {
					if (!levelSpots.get(i + j).getAvailable()) {
						valid = false;
					}
				}
				if (valid) {
					List<Spot> res = new ArrayList<>();
					for (int j = 0; j < size; ++j) {
						res.append(levelSpots.get(i + j));
					}
					return res;
				}
			}
		}
		throw new NoAvailableSpotException();
		return null;
	}

	private ParkingLot() {
		levels = new ArrayList<>();
	}

	private static class LazyParkingLot {
		static final ParkingLot _instance = new ParkingLot();
	}

	public static ParkingLot getInstance() {
		return LazyParkingLot._instance;
	}

	private double hourRate;

	private double calculateParkingFee(Ticket t) {
		Timestamp endTime = new Timestamp();
		return hourRate * (endTime - t.getStartTime());
	}

	public Ticket parkVehicle(Vehicle v) {
		List<Spots> spots = findSpotsForVehicle(v);
		Ticket res = new Ticket(v, spots, new Timestamp());
		return res;
	}

	public void clearSpot(Ticket t) {
		for (Spot spot: ticket.getSpots()) {
			spot.leaveSpot();
		}
	}
}

public class Vehicle {
	protected int size;

	public int getSize() {
		return size;
	}
}

public class Bus extends Vehicle {
	public Bus() {
		size = 3;
	}
}

public class Car extends Vehicle {
	public Car() {
		size = 2;
	}
}

public class Motorcycle extends Vehicle {
	public Motorcycle() {
		size = 1;
	}
}

public class Level {
	private List<Spot> spots;
	
	private int availableCount;

	public getAvaialbleCount() {
		return availableCount;
	}

	public void updateAvaialbleCount(int diff) {
		availableCount += diff;
	}
}

public class Spot {
	private boolean available;

	private Level level;

	public boolean isAvailable() {
		return available;
	}

	public void takeSpot() {
		available = false;
		level.updateAvaialbleCount(-1);
	}

	public void leaveSpot() {
		available = true;
		level.updateAvaialbleCount(1);
	}
}

public class Ticket {
	private Vehicle v;
	
	private List<Spot> spots;

	private Timestamp startTime;

	public Ticket(Vehicle inVehicle, List<Spot> inSpots, Timestamp inStartTime) {
		v = inVehicle;
		spots = inSpots;
		startTime = inStartTime;
	}
}