package oopse;

public class Important_key2 extends Important_key {
	int k = 25;
	String p = "rahul";

	public void computer(int k)
	{
		System.out.println(super.k);
		System.out.println(super.p);
		System.out.println(this.p);
		System.out.println(k);
	}

	public static void main(String[] args)
	{
		Important_key2 v = new Important_key2();
		v.computer(30);
	}
}
