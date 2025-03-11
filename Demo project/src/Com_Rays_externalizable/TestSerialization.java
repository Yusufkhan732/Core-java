package Com_Rays_externalizable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee();

		e.id = 1;
		e.name = "yusuf";
		e.address = "indore";
		e.salary = 50000;
		FileOutputStream file = new FileOutputStream("C:\\Users\\admin\\Desktop\\io\\ExtObj.text");

		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(e);

		out.close();
		file.close();
		System.out.println("Object Write Successfully....");

	}

}
