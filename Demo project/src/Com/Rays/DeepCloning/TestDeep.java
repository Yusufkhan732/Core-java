package Com.Rays.DeepCloning;

public class TestDeep {

	public static void main(String[] args) throws CloneNotSupportedException {

		Subject s = new Subject("56");
		Student s1 = new Student("yusuf", 10221, s);

		Student s2 = (Student) s1.clone();

		s2.name = "khan";
		s2.Rollno = 12222;
		s2.subject.marks = " 67";
		System.out.println(s2.name);
		System.out.println(s2.Rollno);
		System.out.println(s2.subject.marks);

		System.out.println(s.marks);
		System.out.println(s1.name);
		System.out.println(s1.Rollno);

	}

}
