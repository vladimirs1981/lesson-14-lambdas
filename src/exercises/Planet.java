package exercises;

public class Planet {
	
	private int distanceFromSun; //Average distance in millions of kilometers
	private String name;
	private double volume; // Relative to Earth which is 1.0
	private int satellites;
	
	public Planet(String name, int distanceFromSun, double volume,
			int satellites) {
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

	@Override
	public String toString() {
		return "Name=" + name + ", distance from the Sun=" + distanceFromSun + ", volume=" + volume + ", satellites="
				+ satellites + "]";
	}
	
}
