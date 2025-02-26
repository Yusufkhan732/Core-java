package Com_Rays_Exception;

public class TestLoginExceptionCal {

	public static void main(String[] args) {

		System.out.println("Before");

		String login = "admin";
		String password = "admin";

		if (login.equals("admin") && password.equals("invalid")) {

			System.out.println("login successfully...!!");

		} else {
			
			LoginException e = new LoginException("admin");

			try {
				throw e;

			} catch (LoginException e1) {
				System.out.println(e1);
			}
			System.out.println("after");

		}

	}
}