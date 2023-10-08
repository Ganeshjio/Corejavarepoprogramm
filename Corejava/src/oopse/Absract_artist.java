package oopse;

public class Absract_artist extends Abstract_art {       //sub class

	
	void song() {
		System.out.println("i like song");	

	}

	
	void sports() {
		System.out.println("i like cricket game");
		
		

	}

	public static void main(String[] args)
	{
		Absract_artist v = new Absract_artist();
		v.cricket();
		v.singer();
		v.song();
		v.sports();
	}


}







