package basic;

public class Automobile {

	private String color;
	private int speed;
	private String make;
	private static final int No_OF_GEAR = 6;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void Applybraek() {
		System.out.println("Braek apply . vehicle slowing down.....");
		speed = 0;
	}

	public void changeGear(int gear) {
		if (gear > 0 && gear < No_OF_GEAR) {
			System.out.println("gear change to " + gear);
		} else {
			System.out.println("invalid gear . plese select  beetween 1 and" + No_OF_GEAR);
		}
	}

	public void accelerateBy(int accelarateBy) {
		if (accelarateBy > 0) {
			speed += accelarateBy;
			System.out.println("Accelerating... Current speed" + speed + "km / h");
		} else {
			System.out.println("invalid acceleration value");

		}

	}
}