package java08;
import static java.lang.System.out;
public class class2 {

	public static void main(String[] args) {
		Cbbb  obj1 = new Cbbb();
		Cbbb  obj2 = new Cbbb();
		Cbbb  avg = new Cbbb();
		obj1.x = 5.2;
		obj1.y = 3.9;
		obj2.x = 6.5;
		obj2.y = 4.6;
		avg.x = (obj1.x + obj2.x) / 2;
		avg.y = (obj1.y + obj2.y) / 2;
		out.println(obj1);
		out.println(obj2);
		out.println(avg);
	}
	
}
class Cbbb{
	double x;
	double y;
}
