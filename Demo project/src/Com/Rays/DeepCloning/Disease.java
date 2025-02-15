package Com.Rays.DeepCloning;

public class Disease implements Cloneable {

	public int diseaseNo;

	public Disease(int Disease) {
		 diseaseNo = Disease;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
