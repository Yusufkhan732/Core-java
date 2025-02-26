package basic;

public class AutomobileCal {

	public static void main(String[] args) {

		Automobile car = new Automobile();

		car.setColor("red");
		car.setSpeed(0);
		car.setMake("Tesla");

		System.out.println("Auto mobile Details");
		System.out.println("Color");
		System.out.println("speed");
		System.out.println("make");

		System.out.println("\nTesting Acceleration..");
		car.accelerateBy(30);
		car.accelerateBy(50);
		car.accelerateBy(-10);

		System.out.println("\n Changing Gear...");
		car.changeGear(2);
		car.changeGear(4);
		car.changeGear(7);

		System.out.println("\nApplying brake..");
		car.Applybraek();
		System.out.println("Current speed brake ");

		System.out.println("\n final Auto mobile status");
		System.out.println("make  :" + car.getMake());
		System.out.println("color  :" + car.getColor());
		System.out.println("Speed  :" + car.getSpeed() + "km/h");
	}
}
