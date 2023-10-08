package interface_1;

public class Palinder_number {
	
	public static void main(String[]args)
	{
	int num=458;
	int a=0;
	int b;
	int c;
	

	 c=num;
	while(num>0)
	{
		b=num%10;//212//2//0
		a= a*10+b;//2+21+
		num=num/10;//212/10=21//2//0
			
	}
	if(c==a)
	{
		System.out.println("this is a palindrome number");
	}
	
	else
	{
		System.out.println("this is not palindrome number");
	}
      
	}
}
