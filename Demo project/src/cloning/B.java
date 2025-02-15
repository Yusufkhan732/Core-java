package cloning;

public class B {

	public static void main(String[] args) throws CloneNotSupportedException {

		A a = new A("khan");
		A a1 = (A) a.clone();
		a1.name = "yusuf";

		System.out.println(a.name);
		System.out.println(a1.name);

	}

}
