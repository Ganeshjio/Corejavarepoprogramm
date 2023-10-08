package oopse;

public abstract class Abstract {
	// Abstract Class = Complete + Incomplete Both Methods are Present
	// Abstract Method = a) The method which have Declaration but Not Definition
	// b)The method ends with semi colon rather than body/block and absract keyword present at the start of the code is call as Abstract Method

	abstract void makingSound();// Incomplete Methods/ Abstract Method
	abstract void shape();// Incomplete Method/ Abstract Method
	abstract void survive();// Incomplete Method/ Abstract Method

	// complete Method/ Non-Abstract Method
	public void eat () {
		System.out.println("All Animals can eat");
	}

	// complete Method/ Non-Abstract Method
	public void run() {
		System.out.println("All Animals can Run");
	}

    public static void life()
    {
    	System.out.println("All Animals can good life");
    }
}





