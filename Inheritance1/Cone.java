public class Cone extends Cylinder{
    public Cone(){
        super();
    }
    public Cone(double radius, double height) throws IllegalArgumentException {    
        super(radius,height);
    }
    
    @Override
    public double getVolume(){
        return super.getVolume()/3;
    }
    
    //Overriding default Java toString() object
    @Override
    public String toString() {
    	return "-----------------------------------\n" + "\nCone volume is " + getVolume() + "\n";
    }
}
