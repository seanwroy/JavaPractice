package Week12_1;

//Stationwagon subclass, overrides methods from superclass
public class StationWagon extends Car {
	
	@Override
	public void drive() {
		System.out.println("Drive Station Wagon.");
	}
	
	@Override
	public void run() {
		System.out.println("Run Station Wagon.");
	}
	
	@Override
	public void start() {
		System.out.println("Start Station Wagon.");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop Station Wagon.");
	}
	
	@Override
	public void numberOfDoors() {
		System.out.println("The station Wagon has 5 doors.");
	}
	
	public void hasRearSuspension() {
		System.out.println("The station Wagon has a rear suspension.");
	}
	
	public void hasRearDoor() {
		System.out.println("The station Wagon has a rear door.");
	}

}
