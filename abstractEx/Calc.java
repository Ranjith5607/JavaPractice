package abstractEx;

abstract class Calc {
	abstract void display();
}

abstract class Computer extends Calc {

}

class Main {
	public static void main(String[] args) {

		// abstract class we will never create the object
		// Calc calc= new Calc();
		// subClass also we are never creating object
		System.out.println("Hello World");
	}

}
