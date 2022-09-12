package Assignment;

public class Circle {

	double radius,area;
	
	public Circle(int radius) {
		this.radius=radius;
		this.area=0;
	}
	
	public double calculateArea() {
		this.area=3.14*this.radius*this.radius;
		return this.area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(4);
		System.out.println(circle.calculateArea());
		
	}

}
