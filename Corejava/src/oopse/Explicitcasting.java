package oopse;

public class Explicitcasting {
                            //1.primitive casting- b) explicit= it's convert higher to lower
	public void explicit()  //it's use type casting  
	{
		double p = 24.5;
		int q = (int)p;
		System.out.println(q);

		int r = 2144;
		short w = (short)r;
		System.out.println(w);

		long h = 101;
		byte j = (byte)h;
		System.out.println(j);

	}

	public static void main(String[] args)
	{
		Explicitcasting v = new Explicitcasting();
		v.explicit();
	}

	}