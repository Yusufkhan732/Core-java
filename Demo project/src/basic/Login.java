package basic;

import Com_Rays_Exception.LoginException;

public class Login {

	public static void main(String[] args) {

		System.out.println("before");

		String login = "admin";
		String password = "admin";

		if (login.equals("admin") && password.equals("admin")) {

			System.out.println("Login Succsefully.....");

		} else {
			LoginException e = new LoginException("admin");
			try {
				throw e;
			} catch (Exception e1) {

				System.out.println(e1);
			}
			System.out.println("after");

		}
	}
}
