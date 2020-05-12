package optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeToFunctional {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int result = 0;
		// for (int i = 0; i < numbers.size(); i++) {
		// Integer num = numbers.get(i);
		// if (num > 5 && num % 2 == 0 && num < 9 && num * 2 > 15) {
		// result = num;
		// break;
		// }
		// }
//		System.out.println(result);
		/* 1. Predict the result without running the code. */
// Guess the result = 8

		/* 2. Write a functional alternative using the filter method. */
// System.out.print();
		System.out.printf("The results:  %s%n",
				numbers.stream().filter(x -> x > 5 && x % 2 == 0 && x < 9 && x * 2 > 15).collect(Collectors.toList()));

		/*
		 * 3. This example was used in conjunction with a survey to measure the
		 * difference in time it takes to understand imperative versus functional code.
		 * 
		 * Read more about it here:
		 * http://blog.agiledeveloper.com/2015/08/prefer-functional-style-over-
		 * imperative.html
		 */

	}
}
