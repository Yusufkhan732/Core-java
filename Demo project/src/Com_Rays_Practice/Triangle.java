package Com_Rays_Practice;

public class Triangle extends Shape {

	private int base;
	private int hight;

//	public Triangle() {
//		System.out.println("default const");
//	}
//
//	public Triangle(int base, int hight) {
//		System.out.println("1 param const");
//		this.base = base;
//		this.hight = hight;
//	}

	public int getbase() {
		return base;
	}

	public void setbase(int base) {
		this.base = base;

	}

	public int gethight() {
		return hight;
	}

	public void sethight(int hight) {
		this.hight = hight;

	}

	public void Area() {
		double area = (base * hight) / 2;
		System.out.println("Triangle Area" + area);
	}

}
