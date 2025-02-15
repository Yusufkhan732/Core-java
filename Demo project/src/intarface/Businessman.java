package intarface;

public class Businessman implements Richman, SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("earnMoney");

	}

	@Override
	public void party() {

		System.out.println("party");

	}

	@Override
	public void donation() {

		System.out.println("donation");
	}

	@Override
	public void helpToOther() {
		System.out.println("SocialWorker");
	}

}
