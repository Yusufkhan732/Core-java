
public class TestPelindromNumber {

	public static void main(String[] args) {

		int number = 1234321;   // Ye aapka input number hai

		int r = 0;         // Reverse number ke liye variable
		int sum = 0;      // Palindrome check karne ke liye sum

		int n = number;       // Number ko n mein copy kar liya

		// Loop jo number ko reverse karta hai
		while (n > 0) {
			r = n % 10;           // Last digit ko nikal rahe hain
			sum = sum * 10 + r;     // Reverse number ko sum mein add kar rahe hain
			n = n / 10;           // Last digit ko number se hata rahe hain
		}

		// Agar sum aur original number same hain toh palindrome hai
		if (sum == number) {
			System.out.println("Palindrome Number: " + sum);
		} else {
			System.out.println("Not a Palindrome Number: " + sum);
		}
	}
}
