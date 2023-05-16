package exception;

class UserDefinedCheckedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDefinedCheckedException(String message) {
		super(message);
	}

}

public class CheckedException {

	public static void main(String[] args) {

		UserDefinedCheckedException userDefinedCheckedException = new UserDefinedCheckedException(
				"this is checked exception");

		System.out.println(userDefinedCheckedException);

	}
}
