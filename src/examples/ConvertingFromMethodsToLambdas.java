package examples;

import java.util.function.Function;

public class ConvertingFromMethodsToLambdas {

	static Function<Integer, Integer> squareLambda = x -> x * x;

	public int square(int x) {
		return x * x;
	}

	public static void main(String[] args) {
		 System.out.println(new ConvertingFromMethodsToLambdas().square(8));
		 System.out.println(ConvertingFromMethodsToLambdas.squareLambda.apply(8));
	}

	// Create a variable to hold the function
	// Remove the access modifier
	// Remove the method name - it will be referenced by the variable holding it
	// Removed the return type - the compiler will get this information from the interface
	// Add the lambda operator: ->

	// If there's only one parameter, you can remove the parenthesis
	// If the lambda is only one line of code, you can remove the "return", and the curly braces {}
	
}
