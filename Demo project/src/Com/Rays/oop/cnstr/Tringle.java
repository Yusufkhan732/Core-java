package Com.Rays.oop.cnstr;

public class Tringle {

	private int base;

	private int hight;

	public Tringle() {
		System.out.println("default Constructor");
	}

	public Tringle(int base) {
		System.out.println("1 param Constructor");
		this.base = base;
	}

	public Tringle(int hight, int base) {
		System.out.println("2 param constructor");
		this.hight = hight;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public void Area() {
		int area = (hight * base) / 2;
        System.out.println("area:" + area);
	}

}
