package oopse;

public class Consrtuct_abstract1 extends Consrtuct_abstract {  

	@Override                                // //abstract using with constructor
	void kranti() {                             //sub class
		
		System.out.println("india is good kranti ");
	}
	public static void main(String[] args)
	{
		Consrtuct_abstract1 v = new Consrtuct_abstract1();
		v.won();
		v.kranti();
	}
	

}
