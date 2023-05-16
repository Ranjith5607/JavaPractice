package exception;

public class UnckedException {

	public static void main(String[] args) {
		UserDefindUnchekedException userDefindUnchekedException = new UserDefindUnchekedException(
				"this is uncheked exception");
		System.out.println(userDefindUnchekedException);

	}

}

class UserDefindUnchekedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDefindUnchekedException(String message) {
		super(message);

	}

}
