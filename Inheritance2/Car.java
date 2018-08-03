package Week12_1;

//Car superclass
public abstract class Car {
	public void drive() {
		System.out.println("Drive car.");
	}
	
	public void run() {
		System.out.println("Engine running.");
	}
	
	public void start() {
		System.out.println("Start car.");
	}
	
	public void stop() {
		System.out.println("Stop car.");
	}
	
	public abstract void numberOfDoors();
}
