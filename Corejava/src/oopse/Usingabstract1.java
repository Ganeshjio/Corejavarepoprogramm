package oopse;

public class Usingabstract1 extends Usingabstract {   //sub class1

	//declaration
	String name;             //using constructor 
	int weight;

	//initilization
	Usingabstract1()
	{
		name="y 73";
		weight=180;
	}

	//usages

	public void vivo(String name)   //Polymorphism//method overloading
	{
		System.out.println("name="+name); 

	}

	public void vivo(int weight)
	{
		System.out.println("weight="+weight);
	}

	void mobiles() //abstract method
	{
		System.out.println("different android mobiles");
	}

	public void colour()   //method overriding
	{
		System.out.println("red colour");  
	}

	public void laptop()  //upcasting
	{
		System.out.println("hp laptop ");
	}

	public void laptop1()
	{
		System.out.println("dell laptop");
	}


}



