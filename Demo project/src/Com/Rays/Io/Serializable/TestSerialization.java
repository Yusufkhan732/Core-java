package Com.Rays.Io.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws Exception {

		Marksheet m = new Marksheet();

		m.id = 10;
		m.name = "yusuf";
		m.maths = 80;
		m.chemistry = 87;
		m.physics = 80;

		m.total = m.chemistry + m.physics + m.maths;

		FileOutputStream file = new FileOutputStream("C:\\Users\\admin\\Desktop\\io\\obj.text");

		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(m);
		out.close();
		file.close();

		System.out.println("Object write successfully...");
		System.out.println("total" + m.total);

	}
}
