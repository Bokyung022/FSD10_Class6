package June14th;

public class MyProgram11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myfunc());

		System.out.println(addfivetoit(8));

		System.out.println(add(8, 2));

		System.out.println(sub(8, 2));

		System.out.println(mul(8, 2));

		System.out.println(div(8, 2));

	}

	public static double myfunc() {
		return 7.4;
	}

	public static int addfivetoit(int x) {
		return x + 5;
	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mul(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}
}
