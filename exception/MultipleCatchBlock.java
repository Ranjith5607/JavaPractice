package exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		try {
			int i = 10 / 0; // will throw ArithmeticException
		} catch (ArithmeticException ae) {
			System.out.println("Exception handled - ArithmeticException");
		} catch (RuntimeException re) {
			System.out.println("Exception handled - RuntimeException");
		} catch (Exception e) {
			System.out.println("Exception handled - Exception");
		}

		try {
			int i = 10 / 0; // will throw ArithmeticException

		}

		catch (Exception e) {
			System.out.println("Exception handled - Exception");
		}

//		catch (Exception | RuntimeException re) {
//			System.out.println("Exception handled - RuntimeException");
//		}
//			catch (ArithmeticException ae) {
//			System.out.println("Exception handled - ArithmeticException");
//		} 

	}

}
