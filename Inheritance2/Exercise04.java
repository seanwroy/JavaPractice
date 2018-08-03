package Week12_1;

public class Exercise04 {
	public static void main(String[] args) {
		
		//Creating three cars
		Hatchback ha = new Hatchback();
		ha.drive();
		ha.run();
		ha.start();
		ha.stop();
		ha.hasBigCargoSpace();
		ha.foldBackSeats();
		System.out.println("------------------------\n");
		
		Sedan se = new Sedan();
		se.drive();
		se.run();
		se.start();
		se.stop();
		se.openRoof();
		se.closeRoof();
		System.out.println("------------------------\n");
		
		StationWagon sw = new StationWagon();
		sw.drive();
		sw.run();
		sw.start();
		sw.stop();
		sw.hasRearSuspension();
		sw.hasRearDoor();
		System.out.println("------------------------\n");
		
		//Creating an array
		Car[] cars = new Car[6];
		cars[0] = new Sedan();
		cars[1] = new StationWagon();
		cars[2] = new Sedan();
		cars[3] = new Hatchback();
		cars[4] = new Hatchback();
		cars[5] = new Sedan();
		
		//Starting and stopping all cars in the array using a For-loop
		for (int i = 0; i < cars.length; i++) {
			cars[i].start();
			cars[i].stop();
		}

	}

}
