package oopse;

public class Overloading_polymorphism {

	public void multiplication(int a, int b)

	{
		int c = a*b;
		System.out.println(c);     //method overloding in same method name but diffrent argument pass
                                   // it's use only same class 
	}

	public void multiplication(int a, int b, int c)
	{
		int d = a*b*c;
		System.out.println(d);
	}

	public static void main(String[] args)
	{
		Overloading_polymorphism v = new Overloading_polymorphism();
		v.multiplication(14,15);
		v.multiplication(5,6,8);
	}
}
