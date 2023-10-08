package interface_1;

public class Encapsulation_personal2 {
	public static void main(String[]args)
	{
		Encapsulation_personal v = new Encapsulation_personal();
		v.setname("Ganesh dinkerrao kate");
		String name=v.getname();
		System.out.println("Name="+name);

		v.setid(20);
		int id = v.getid();
		System.out.println("ID="+id);

		v.setmobilenumber(9420385795l);
		long mobilenumber = v.getmobilenumber();
		System.out.println("Mobile number="+mobilenumber);

		v.setaddress("at.post-kaij, dist-beed,");
		String address = v.getaddress();
		System.out.println("Address="+address);

		v.seteducation("BE(etc)");
		String education = v.geteducation();
		System.out.println("Education="+education);
		
		v.setsports("my favourite sports is  cricket");
		String sports = v.getsports();
		System.out.println("Sports="+sports);
		

	}

}