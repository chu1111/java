package java08;

import static java.lang.System.out;

public class class5 {

	public static void main(String[] args) {
			Cbox box = new Cbox();
			box.length = 1;
			box.width = 1;
			box.height = 1;
			box.showAll();
	}

}

class Cbox {
	int length;
	int width;
	int height;
	int volume(){
		return length * width * height;
	}
	int SurfaceArea() {
		return (length * width + length * height + width * height) * 2;
	}
	void showData() {
		out.printf("%d %d %d",  length, width, height);
	}
	void showAll() {
		showData();
		out.print(SurfaceArea());
		out.print(volume());
		
	}
}
