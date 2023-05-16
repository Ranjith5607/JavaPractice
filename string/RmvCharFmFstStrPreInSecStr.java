package string;

public class RmvCharFmFstStrPreInSecStr {

	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer();

		String str1 = "abc";
		String str2 = "bc";

		for (int i = 0; i < str1.length(); i++) {

			int flag = 0;
			for (int j = 0; j < str2.length(); j++) {

				if (str1.charAt(i) == str2.charAt(j)) {
					flag++;
				}

			}

			if (flag != 1) {
				buffer.append(str1.charAt(i));

			}

		}
		System.out.println(buffer);

	}

}
