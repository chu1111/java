package java08;

import static java.lang.System.out;

public class class7 {

	public static void main(String[] args) {
		Ctest c = new Ctest();
		c.test(3);
		c.test(8);
		c.test(0);
	}

}

class Ctest {
	void test(int num) {
		if (num == 0)
			out.print("���Ƭ�0");
		else if (num % 2 == 0)
			out.print("���Ƭ�����");
		else
			out.print("���Ƭ��_��");
	}
}
