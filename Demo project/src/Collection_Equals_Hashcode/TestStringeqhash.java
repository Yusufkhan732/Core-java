package Collection_Equals_Hashcode;

public class TestStringeqhash {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "java";

		System.out.println(s1.equals(s2));

		System.out.println(s1.hashCode());

		System.out.println(s2.hashCode());

	}
}
