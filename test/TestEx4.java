package test;

public class TestEx4<T extends Number> {
	T t;

	public static void main(String[] args) {

		TestEx4 q = new TestEx4<Integer>(); // 1
		q.t = new Float(1); // 2
		System.out.println(q.t);
	}
}
