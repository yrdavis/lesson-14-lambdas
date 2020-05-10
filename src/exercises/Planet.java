package exercises;

/*
 * @author Yvonne Davis
 * @version 1
 * Sort and filter job candidates based on criteria
 */
public class Planet {

	private int distanceFromSun; // Average distance in millions of kilometers
	String name;
	private double volume; // Relative to Earth which is 1.0
	private int satellites;

	public Planet(String name, int distanceFromSun, double volume, int satellites) {
		super();
		this.name = name;
		this.distanceFromSun = distanceFromSun;
		this.volume = volume;
		this.satellites = satellites;
	}

	public int getDistanceFromSun() {
		return distanceFromSun;
	}

	public String getName() {
		return name;
	}

	public double getVolume() {
		return volume;
	}

	public int getSatellites() {
		return satellites;
	}

	public String toString() {
		return "\n" + "Planet name " + this.name + ", " + "Distance from Sun " + this.distanceFromSun + ", " + "Volume "
				+ this.volume + ", " + "No. satelllites " + this.satellites;
	}
}
