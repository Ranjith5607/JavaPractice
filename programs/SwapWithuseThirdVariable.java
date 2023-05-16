package programs;

public class SwapWithuseThirdVariable {

	public static void main(String[] args) {

		int firstNumber = 10, secondNumber = 20;
		int temperNumber = 0;

		temperNumber = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temperNumber;

		System.out.println("firstNumber:" + firstNumber + " " + "firstNumber:" + firstNumber);

	}

}
