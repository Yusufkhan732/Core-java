package consructor;

public class Triangle {
	private int Base;
	private int Hight;

	public Triangle() {
		System.out.println("default Const");
	}

	public Triangle(int Base, int Hight) {
		System.out.println("1 param Const");
		this.Base = Base;
		this.Hight = Hight;

	}

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
		System.out.println("Tiangle Area" + area);
	}

}
