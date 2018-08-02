package Week11_2;

public class Sphere extends Circle {	
	private double height;
	
	public Sphere() {
		super();
		this.height = 1;
	}
	
	public Sphere (double radius, double height) throws IllegalArgumentException {	        
	    this.setRadius(radius);
		this.setHeight(height);
	}
	
	public void setHeight(double height) throws IllegalArgumentException {
        if (height <= 0){
        	throw new IllegalArgumentException("The height cannot be negative.");
        }
        
        this.height = height;
   
    }
	
	public double getHeight() {
		return this.height;
	}
	
    public double getVolume(){
        return super.getArea() * this.getHeight();
    }
    
    public double getSurfaceArea(){
        return 4/3 * super.getArea() * super.getRadius();
    }
    
    @Override
    public String toString() {
    	return "-----------------------------------\n" + "\nSphere height is " + getHeight() + "\nSphere volume is " + getVolume() + 
    			"\nSphere surface area is " + getSurfaceArea() + "\n";
    }

}
