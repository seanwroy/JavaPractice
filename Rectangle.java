public class Rectangle {
	private Double length;
	private Double width;
	
	public static void main(String[] args) {
		Rectangle one = new Rectangle(5, 30);
		Rectangle two = new Rectangle(40, 14);
		Rectangle three = new Rectangle(24, 30);
		Rectangle four = new Rectangle(24, 30);
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four.equals(three));
	}
	
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}
	
	@Override
	public String toString(){
		double perimeter = (length + width) * 2;
		double area = length * width;
		
		return "The length of the rectangle is " + length + " and its width is " + width + 
				" the perimeter is " + perimeter + " and the area is " + area;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Rectangle otherRectangle = (Rectangle)obj;
			
			if (this.width.equals(otherRectangle.getWidth()) || this.width.equals(otherRectangle.getLength())
					&& this.length.equals(otherRectangle.getLength()) || this.length.equals(otherRectangle.getWidth())) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	
	public double getLength() {
		return this.length;
	}

	public void setLength(double length) throws ArithmeticException {
		if(length <= 0) {
			throw new ArithmeticException("Length must be larger than 0.");
		}
		
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) throws ArithmeticException {
		if(width <= 0) {
			throw new ArithmeticException("width must be larger than 0.");
		}
		
		this.width = width;
	}
}