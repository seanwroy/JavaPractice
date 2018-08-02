

public class ShapeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Try block for catching exceptions
        try{
        	//Testing various shapes
        	Circle c = new Circle(5);
        	System.out.println(c.toString());
        
        	Circle c2 = new Circle(10);
        	System.out.println(c2.toString());
        
        	Cylinder cy = new Cylinder(3, 4);
        	System.out.println(cy.toString());
        
        	Cylinder cy2 = new Cylinder(10, 5);
        	System.out.println(cy2.toString());
        
        	Cone co = new Cone(3, 4);
        	System.out.println(co.toString());
        
        	Cone co2 = new Cone(6, 8);
        	System.out.println(co2.toString());
        
        	Sphere sp = new Sphere(4, 5);
        	System.out.println(sp.toString());
        
        	Sphere sp2 = new Sphere(15, 3);
        	System.out.println(sp2.toString());
        
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }catch(Exception e){
        	System.out.println(e);
        }
    }
    
}
