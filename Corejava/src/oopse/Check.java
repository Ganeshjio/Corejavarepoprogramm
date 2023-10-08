package oopse;

public final class Check {

	final int age = 50;   //using final keyword
	final String name="pune";

	final void sachin()

	{
		System.out.println(" sachin age is 50");
		System.out.println(" pune is nice city");
	}

	public static void main(String[]args)
	{
		Check v = new Check();
		v.sachin();

	}
}
