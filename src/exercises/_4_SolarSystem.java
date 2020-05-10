package exercises;

/*
 * @author Yvonne Davis
 * @version 1
 * Sort and filter solar system information based on criteria
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _4_SolarSystem {

	public static void main(String[] args) {
		List<Planet> planets = Arrays.asList(new Planet("Mercury", 57, 0.056, 0), new Planet("Venus", 108, 0.866, 0),
				new Planet("Jupiter", 779, 1321, 79), new Planet("Mars", 228, 0.151, 2), new Planet("Earth", 150, 1, 1),
				new Planet("Saturn", 1430, 763.59, 62));

		// 1: Sort the planets by distance from the sun
		Collections.sort(planets, (pl1, pl2) -> pl2.getDistanceFromSun() - pl1.getDistanceFromSun());
		System.out.println("Sorted by distance from the Sun: " + planets);
		// 2. Sort the planets in alphabetical order
		Collections.sort(planets, (pl1, pl2) -> pl1.getName().compareTo(pl2.getName()));
		System.out.println("Sorted by name: " + planets);
		// 3. Sort planets from largest to smallest

		Collections.sort(planets, (pl1, pl2) -> Double.compare(pl2.getVolume(), pl1.getVolume()));
		System.out.println("Sorted by volume size: " + planets);
	}

}
