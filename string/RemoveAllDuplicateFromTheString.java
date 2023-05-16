package string;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveAllDuplicateFromTheString {

	public static void main(String[] args) {

		String str = "abccbcb";
		String valueOf = "";
		char[] charArray = str.toCharArray();

		HashSet<Character> hashSet = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			hashSet.add(charArray[i]);

		}

		Iterator<Character> iterator = hashSet.iterator();

		while (iterator.hasNext()) {
			Character character = (Character) iterator.next();

			valueOf = valueOf + String.valueOf(character);

		}

		System.out.println(hashSet);
		System.out.println(valueOf);

	}
}
