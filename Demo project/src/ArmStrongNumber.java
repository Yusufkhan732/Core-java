
public class ArmStrongNumber {

	public static void main(String[] args) {

		int number = 153; // Yahan hum number 153 ko check kar rahe hain

		int r = 0; // remainder store karne ke liye

		int sum = 0; // sum ko initialize kar rahe hain jo final answer dega

		int n = number; // original number ko n mein store kar rahe hain

		while (n > 0) { // jab tak n ki value 0 se badi hai, tab tak loop chalega

			r = n % 10; // n ka last digit r mein store karenge (remainder)

			sum = sum + (r * r * r); // us digit ka cube calculate karke sum mein add karenge

			n = n / 10; // ab n ko 10 se divide karenge (next digit ke liye)
		}

		if (sum == number) { // agar sum, number ke barabar hai, toh Armstrong number hai

			System.out.println("Armstrong Number");

		} else { // agar sum, number ke barabar nahi hai, toh Armstrong number nahi hai

			System.out.println("not Armstrong Number");

		}

	}

}