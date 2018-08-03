package Week12_2;

//Abstract superclass Student
public abstract class Student {
	public abstract void sleep();
	public abstract void study();
	
	public void attendClass() {
		System.out.println("Students go to class.");
	}
	public void doHomework() {
		System.out.println("Students do homework.");
	}
	
}
