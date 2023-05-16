package programs;

public class SwapWithoutThirdEx1 {
	public static void main(String[] args) {

		int firstNumber = 10, secondNumber = 20;

		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;

		System.out.println("firstNumber:" + firstNumber + " " + "secondNumber:" + secondNumber);

	}

}
