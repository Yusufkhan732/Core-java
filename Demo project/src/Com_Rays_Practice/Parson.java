package Com_Rays_Practice;

public class Parson {

	private String name;
	private String dob;
	private String address;
	private static final int Avg_Age = 20;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static int getAvgAge() {
		return Avg_Age;

	}

	public static void main(String[] args) {
		Parson p = new Parson();
		p.setAddress("Rampura");
		System.out.println(p.address);
		p.setDob("2002");
		System.out.println(p.dob);
		p.setName("yusuf");
		System.out.println(p.name);
		System.out.println(p.Avg_Age);


	}

}
