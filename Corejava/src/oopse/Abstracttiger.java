package oopse;

public  class Abstracttiger extends Abstract  //sub class
{

	void makingSound() {
	System.out.println("surli awaj");

	}

	void shape() {
		System.out.println("tiger good shape");

	}

	
	void survive() {
		System.out.println("ability survive");
                                                     
	}
	
	public static void main(String[] args)
	{
		
		Abstract v = new Abstracttiger();       //upcasting
		v.eat();
		v.run();
		v.makingSound();
		v.shape();
		v.survive();
		life();
		
	}

}

