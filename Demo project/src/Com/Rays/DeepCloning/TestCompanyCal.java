package Com.Rays.DeepCloning;

public class TestCompanyCal {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employe e = new Employe("Anas", 123);

		Company c = new Company("TCS", 80000, e);

		Company c1 = (Company) c.clone();
		c1.companyName = "Google";
		c1.salary = 90000;
		c1.employe.EmpoyeName = "yusuf";
		c1.employe.id = 33;

		System.out.println(c1.companyName);
		System.out.println(c1.salary);
		System.out.println(c1.employe.EmpoyeName);
		System.out.println(c1.employe.id);

		System.out.println(e.EmpoyeName);
		System.out.println(e.id);
		System.out.println(c.companyName);
		System.out.println(c.salary);

	}

}
