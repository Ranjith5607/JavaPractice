package exception;

public class NestedTryAndCatchBlock {

	public static void main(String[] args) {

		try {
			int i = 10 / 0; // will throw ArithmeticException
		} catch (ArithmeticException ae) {
			System.out.println("try-catch block handled - ArithmeticException");

			// using nested try-catch block
			try {
				String s = null;
				s.charAt(0); // will throw NullPointerException
			} catch (NullPointerException npe) {
				System.out.println("NESTED try-catch block handled - " + "NullPointerException");
			}

		}

	}

}
