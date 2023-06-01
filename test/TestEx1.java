package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEx1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {

			list.add(i);

		}
		System.out.println(list);

		Iterator<Integer> iterator = list.listIterator();

		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			list.add(11);
		}
	}

}
