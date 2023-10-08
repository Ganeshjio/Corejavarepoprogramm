package oopse;

public class Implicitecasting {

	public void m1()
	{
		byte b= 110;       //casting; conversion of one type of information into another type information
		int k = b;         //1.primitive casting- a)implicit casting/conversion- it's lower to higher 
		System.out.println(k); //

		short d = 32610;
		long p = d;
		System.out.println(p);
		
		int a = 2147483647;
		long s = a;
		System.out.println(s);
	}


	public static void main(String[] args)

	{
		Implicitecasting v = new Implicitecasting();
		v.m1();
	}

}