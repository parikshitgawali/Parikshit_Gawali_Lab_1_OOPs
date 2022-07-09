package OOPlab1;

public class Rectangle extends Shape {
	int height;
	int width;

	public Rectangle(String color, String type, int width, int height) {
		super(color, type);
		this.height = height;
		this.width = width;
	}

	double calArea() {
		return (height * width);
	}

	double peri() {
		return ((height + width) * 2);
	}


}
