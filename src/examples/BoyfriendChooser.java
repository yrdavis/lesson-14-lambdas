package examples;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoyfriendChooser {

	public static void main(String[] args) {

		Boy jason = new Boy("Jason", true, false);
		Boy frank = new Boy("Frank", false, true);
		Boy brian = new Boy("Professor Brian Cox", true, true);
		
		List<Boy> boys = List.of(jason, frank, brian);
		
		Stream<Boy> streamOfBoys = boys.stream();
		
		Predicate<Boy> predicate = boy -> boy.isFunny(); 	// this is a lambda expression	
		
		List<Boy> possibleBoyfriends = streamOfBoys
				.filter(predicate)
				.filter(boy -> boy.isEmotionallyAvailable())
				.collect(Collectors.toList());
		
		System.out.println(possibleBoyfriends);
		
	}

}
