package Com_Rays_Intarface;

public class Test_Busniessman {
	public static void main(String[] args) {

		Businessman b = new Businessman();
		b.earnMoney();
		b.party();
		b.donation();

		Richman r = new Businessman();
		r.earnMoney();
		r.donation();
		r.party();

		SocialWorker s = new Businessman();
		s.helpToOther();

	}

}
