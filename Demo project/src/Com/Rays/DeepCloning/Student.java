package Com.Rays.DeepCloning;

public class Student implements Cloneable {

	public String name;

	public int Rollno;

	public Subject subject;

	public Student(String name, int Rollno, Subject subject) {
		this.name = name;
		this.Rollno = Rollno;
		this.subject = subject;
		

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s = (Student) super.clone();
		s.subject = (Subject) s.subject.clone();

		return s;
	}

}
