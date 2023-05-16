package java8programs;

public class PrintDatAndTime {
	public static void main(String[] args) {

		System.out.println("date:" + java.time.LocalDate.now());
		System.out.println("time:" + java.time.LocalDateTime.now());

	}

}
