package shapearray;

public class Triangle extends Shape {

	private int Base;
	private int Hight;

	public int getBase() {
		return Base;
	}

	public void setBase(int base) {
		Base = base;
	}

	public int getHight() {
		return Hight;
	}

	public void setHight(int hight) {
		Hight = hight;
	}

	public void Area() {
		double area = (Base * Hight) / 2;
		System.out.println("Triangle Area" + area);
	}

}
