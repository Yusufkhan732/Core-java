package Com_Rays_Exception;

public class TestUncheckedPropogation {

	public static void main(String[] args) {

		Dad();

	}

	private static void Dad() {
		try {

			mom();

		} catch (CoustomUnCheckedException e) {
			e.printStackTrace();

		}

	}

	public static void mom() {
		son();

	}

	public static void son() {

		CoustomUnCheckedException e = new CoustomUnCheckedException();
		throw e;

	}

}
