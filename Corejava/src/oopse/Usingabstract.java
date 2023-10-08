package oopse;

public abstract class Usingabstract {
	
	
	public void singlelevel()   //Single inheritance   //super class
	{
		System.out.println("first step");
	}

	abstract void mobiles();  //incomplete method
	
	
	//complete method   //Polymorphism
	public void colour()   //method overriding
	{
		System.out.println("black colour");  
	}

}
