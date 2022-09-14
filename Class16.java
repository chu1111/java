package java08;

import static java.lang.System.out;

public class Class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class CSphere {
	private int x;
	private int y;
	private int z;
	private int radius;

	void setLocation() {
		x = 3;
		y = 4;
		z = 5;
	}

	void setRadius() {
		radius = 1;
	}

	double setfaceArea() {
		return 4 * Math.PI * radius * radius;
	}

	double setvolume() {
		return Math.PI * Math.pow(radius, 3);
	}

	void showCenter() {
		out.printf("(%s,%s,%s)", x, y, z);
	}
}