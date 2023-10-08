package oopse;

public class Usingabstract3 {
	
	public static void main(String[]args)
	{
		Usingabstract1 v = new Usingabstract1();
		v.colour();  // overriding
		v.mobiles(); //non static method
		v.vivo("y 73 model");//overloading
		v.vivo("180 gram");//overloading
		v.singlelevel();//single levelinheritance
		
		
		Usingabstract1 x = new Usingabstract2();  //upcasting
		x.laptop();
		x.laptop1();
		
		Usingabstract2 d = new Usingabstract2();  //downcasting
		d.sports();
		
		
	}

}


