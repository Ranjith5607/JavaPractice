package programs;

public class RemoveTheDuplicateValuesEx1 {

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;

		// index that unique characters will be inserted at
		int addIndex = 1;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] < nums[i + 1]) { // if true, num[i + 1] is a new unique number
				nums[addIndex] = nums[i + 1];
				addIndex++;
			}
		}
		return addIndex;
	}


	public static void main(String[] args) {

		// input [1,2,2,3]
		// out put[1,2,3,3]

		// input[1,2,3,4,3,2]
		// output[1,2,3,4,3,2]
		int[] numbers = new int[] { 1,2,2,3};

		RemoveTheDuplicateValuesEx1.removeDuplicates(numbers);

		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
		}
	}

}
