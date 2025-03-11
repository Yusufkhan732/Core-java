package Com.Rays.Io.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeSerialization {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\io\\obj.text");

		ObjectInputStream in = new ObjectInputStream(file);

		Marksheet m = (Marksheet) in.readObject();

		System.out.println("id " + m.id);

		System.out.println("name " + m.name);

		System.out.println("chemitry " + m.chemistry);

		System.out.println("maths " + m.maths);

		System.out.println("physics " + m.physics);

		System.out.println("total " + m.total);

		in.close();
		file.close();

	}

}