package override.copy;

public class TestShape {

	public static void main(String[] args) {

		ClassShape cs = new ClassShape();
		cs.area();
		
          ClassShape s1 = new Rectangle();
          s1.area();
          
          ClassShape s2 = new Rectangle();
          s2.area(5, 8);
          
          ClassShape s = new ClassShape();
          s.area();
          
          
          
          
	}
}
