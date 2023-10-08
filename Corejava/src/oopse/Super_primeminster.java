package oopse;

public class Super_primeminster extends Super_president {
	                                                            //sub class
	String name; //Declaration
	
	Super_primeminster()//Initialization
	{
		 name= "delhi";
		
	}
	
	public void role()   //usages
	{
		System.out.println("lady president ");
		super.role();
		System.out.println("name;"+super.name);
		System.out.println("name;"+this.name);
	
		
	}

	public static void main(String[]args)
	{
		Super_primeminster v = new Super_primeminster();
		v.role();
		new Super_president();
        new Super_primeminster();
	}
}
