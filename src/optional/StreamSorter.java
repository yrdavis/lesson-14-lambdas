package optional;

import java.security.SecureRandom;

public class StreamSorter {
	public static void main(String[] args) {
//		Integer[] nums = new Integer[50];
//		for (int i = 0; i < nums.length; i++) {
		SecureRandom rGen = new SecureRandom();
//			nums[i] = rGen.nextInt();

		// 1. Convert the Integer array to Stream object.

		rGen.ints(50)
				// 2. Use the sorted method of the stream to sort the numbers.
				.sorted()
				// 3. Use the forEach method with a lambda to print all the elements of the

				.forEach(System.out::println);
		// They should be in ascending order.
	}
}
