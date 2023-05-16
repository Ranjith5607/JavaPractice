package exception;

class A {

	void m1() throws NullPointerException {

	}
}

class B extends A {

	@Override
	void m1() throws RuntimeException {
		final int i1;
		i1 = 10;
	}
}

public class ThrowEx1 {

	public static void main(String[] args) {
		System.out.println("method return -> " + m());
	}

	static String m() {
		try {
			int i = 10 / 0; // will throw ArithmeticException
		} catch (ArithmeticException e) {
			return "catch";
		} finally {
			return "finally";
		}

	}

}
