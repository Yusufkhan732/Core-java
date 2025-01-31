package oop.rays.com;

public class Person {

	private String name;
	private String dob;
	private String address;
	public static final int AVG_AGE = 20;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setdob(String dob) {
		this.dob = dob;
	}

	public String getdob() {
		return dob;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public String getAddress() {

		return address;
	}

	public static int getAvgAge() {
		return AVG_AGE;
	}

}
