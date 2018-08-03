package Week12_1;

//Hatchback subclass, overrides methods from superclass
public class Hatchback extends Car {
	
	@Override
	public void drive() {
		System.out.println("Drive Hatchback.");
	}
	
	@Override
	public void run() {
		System.out.println("Run Hatchback.");
	}
	
	@Override
	public void start() {
		System.out.println("Start Hatchback.");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop Hatchback.");
	}
	
	@Override
	public void numberOfDoors() {
		System.out.println("The hatchback has 2 doors.");
	}
	
	public void hasBigCargoSpace() {
		System.out.println("The hatchback has a bigger cargo space than the Sedan.");
	}
	
	public void foldBackSeats() {
		System.out.println("The hatchback has folded rear seats.");
	}
}
