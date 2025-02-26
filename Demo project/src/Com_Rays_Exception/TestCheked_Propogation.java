  package Com_Rays_Exception;

public class TestCheked_Propogation {

	public static void main(String[] args) {

		Dad();

	}

	public static void Dad() {

		try {
			mom();
			
		} catch (CustomChekedException e) {
			
			e.printStackTrace();
		}

	}

	public static void mom() throws CustomChekedException {
		son();

	}

	public static void son() throws CustomChekedException {

		CustomChekedException e = new CustomChekedException();

		throw e;

	}
}