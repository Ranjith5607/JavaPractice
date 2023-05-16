package trickyPrograms;

public class TryAndCatch {
	public static void main(String[] args) {
		boolean flag = false;
		try {
			if (flag) {
				while (true) {
				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}
	}

}
