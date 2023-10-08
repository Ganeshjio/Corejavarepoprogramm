package oopse;

public class Polymorpshim_aeraofcircle {

	float pie;                   //instance variable
	int r;                       //Polymorpshim 
	double areaofcircle;

	public void circlearea(int r1)  //

	{
		System.out.println("area of 1 circle");
		pie = 3.147f;
		r = 10;
		areaofcircle = pie *r * r;
		System.out.println("area of 1 circle="+ areaofcircle);	
	}

	public void circlearea(int r1, int r2)     // on the basis of argument  
	{  

		System.out.println("area of 2 circle");
		pie = 3.147f;
		r = r2-r1;
		areaofcircle = 2*pie *r *r;
		System.out.println("area of 2 circle="+ areaofcircle);
	}
	public static void main(String[] args)
	{
		Polymorpshim_aeraofcircle v = new Polymorpshim_aeraofcircle();
		v.circlearea(15);
		v.circlearea(10,20);
		
	}
	
	}
