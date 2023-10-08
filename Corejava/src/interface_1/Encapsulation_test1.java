package interface_1;

public class Encapsulation_test1 {
	
	public static void main(String[] args) {
		Encapsulation_test e = new Encapsulation_test();
		e.setBalance(2000);
		double value = e.getBalance();// 2000
				
		System.out.println("Balance is  = " + value);
		System.out.println(e.getBalance());
	}

}
