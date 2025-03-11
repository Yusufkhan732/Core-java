package Com.Rays.Io.Serializable;

import java.io.Serializable;

public class Marksheet implements Serializable {

	public int id = 0;

	public String name = null;

	public int physics;
	public int chemistry = 0;
	public int maths = 0;
	public  transient int  total = 0;

}
