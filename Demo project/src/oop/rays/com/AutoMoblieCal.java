package oop.rays.com;

public class AutoMoblieCal {
	
	public static void main(String[] args) {
		
		
		AutoMobile m = new AutoMobile();
		
		m.setColor("red");
		System.out.println(m.getColor());
		
		m.setSpeed(150);
		System.out.println(m.getSpeed());
		
		m.applyBrake();
		System.out.println("brake");
		
		m.changeGear(5);
		
		System.out.println(5);
		
		m.accelerate(20);
		
		System.out.println();
	}

}
