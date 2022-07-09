package OOPlab1;

public class circle extends Shape {

	int radius;
	final double pi = 3.14;

	public circle(String color, String type,int radius) {
		super(color, type);
		this.radius = radius;
	}

	double calArea() {
		return (pi*(radius^2));
	}

	double peri() {
		return ((pi * radius) * 2);
	}


}
