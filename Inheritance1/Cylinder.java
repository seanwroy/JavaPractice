public class Cylinder extends Circle{
    private double height;
    
    public Cylinder() {
        //super.setRadius(1);
        //super(1);
        super();
        this.height = 1;
    }
    
    public Cylinder(double radius, double height) throws IllegalArgumentException {
        super(radius);
        this.setHeight(height);
    }
    
    public void setHeight(double height) throws IllegalArgumentException {
        if (height <= 0){
            throw new IllegalArgumentException("The height must be positive");
        }
        this.height = height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double getVolume(){
        return super.getArea() * this.getHeight();
    }
    
    public double getSurfaceArea(){
        return 2 * super.getArea() + super.getCircumference() * this.height;
    }
    
    //Overriding default Java toString() object
    @Override
    public String toString() {
    	return "-----------------------------------\n" + "\nCylinder height is " + getHeight() + "\nCylinder volume is " + getVolume() + 
    			"\nCylinder surface area is " + getSurfaceArea() + "\n";
    }
}
