
package Week11_2;


public class Circle {
    private double radius;
    
    public Circle(){
        this.radius = 1;
    }
    
    public Circle(double radius) throws IllegalArgumentException {
        this.setRadius(radius);
    }
    
    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius <= 0){
            throw new IllegalArgumentException("The radius must be positive");
        }
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    }
    
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    
    @Override
    public String toString() {
    	return "-----------------------------------\n" + "\nCircle radius is " + getRadius() + "\nCircle area is " + getArea() + 
    			"\nCircle circumference is " + getCircumference() + "\n";
    }
}
