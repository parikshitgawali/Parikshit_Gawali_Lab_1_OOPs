package OOPlab1;

public class Shape {

	String color;
	String type;

	public Shape(String color, String type) {
		this.color = color;
		this.type = type;
	}

	double calArea() {
		return 0;
	}

	double peri() {
		return 0;
	}

	void display() {
		System.out.print("Shape : " + type + " ,color :" + color + "\n");

	}

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle("blue", "rect", 2, 3);
		rect1.display();
		System.out.print("Area = " + rect1.calArea() + "\n");
		System.out.print("peri = " + rect1.peri() + "\n");

		square sq1 = new square("yellow", "square", 2);
		sq1.display();
		System.out.print("Area = " + sq1.calArea() + "\n");
		System.out.print("peri = " + sq1.peri() + "\n");

		circle cirle1 = new circle("red", "circle", 4);
		cirle1.display();
		System.out.print("Area = " + cirle1.calArea() + "\n");
		System.out.print("peri = " + cirle1.peri());
	}
}
