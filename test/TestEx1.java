package test;

import java.time.LocalDate;

class Base {

	public int i = 1;

	public void call() {

		System.out.println("base call");
	}
}

class deveried extends Base {

	public void call() {

		i = 2;
		System.out.println("base call");
	}
}

public class TestEx1 {

	public static void main(String[] args) {

		LocalDate plusDays = LocalDate.now().plusDays(6);
//		 LocalDate of = LocalDate.with(2014, 0, 30);
//		 LocalDate of1 = LocalDate.of(2014 );

		
		
		deveried testEx1 = new deveried();
		System.out.println(plusDays);
	}

}
