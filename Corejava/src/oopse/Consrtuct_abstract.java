package oopse;

public abstract class Consrtuct_abstract {   //abstract using with constructor
	                                         //super class
	//Declaration
    String name;
    int p ;
    
    //initialization
    Consrtuct_abstract()
    {
    	name="india";
    	 p=73;
    } 
    //usages
    public void won()
    {
    	System.out.println("name="+name);
    	System.out.println("p="+p);
    }
    abstract void kranti();
}
