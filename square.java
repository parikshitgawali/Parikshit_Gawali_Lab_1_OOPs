package OOPlab1;

public class square extends Rectangle {


	public square(String color, String type, int side) {

		super(color, type , side, side);

		super.calArea();
		super.peri();

	}
}