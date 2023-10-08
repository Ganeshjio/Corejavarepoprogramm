package oopse;

public class Hiealinhertancemahabaleshwar extends Hiealinhertancetravel {
	
	public void pune()
	
	{
		System.out.println("to go mahabaleshawar hill station");
	}

	public void fort()                         //hierachieal inhertance
	                                           //sub class 2
	{
		System.out.println("to go pratap fort");
	
	}
	
	public static void main(String[] args)
	{
		Hiealinhertancemahabaleshwar v = new Hiealinhertancemahabaleshwar();
		 v.travel();
		 v.pune();
		 v.fort();
		 
	}

}
