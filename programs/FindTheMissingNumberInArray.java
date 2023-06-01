package programs;

public class FindTheMissingNumberInArray {

	public static int missingNumber(int[] nums) {
		int len = nums.length;
		int[] temp = new int[len + 1];
		for (int i = 0; i < len; i++) {
			temp[nums[i]]++;
		}
		
		//where = 0 is missing number
		for (int i = 0; i < len; i++) {
			if (temp[i] == 0)
				return i;
		}
		return len;

	}

	public static void main(String[] args) {

		int[] num = new int[] { 1, 6, 4, 2, 0, 5, 7, 8, 9 };

		System.out.println(FindTheMissingNumberInArray.missingNumber(num));
	}

}
