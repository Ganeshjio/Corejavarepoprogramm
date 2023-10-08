package interface_1;

public class Encapsulation_personal {

	private String name;
	private int id;
	private long mobilenumber;
	private String address;
	private String education;
	private String sports;

	//getter methods

	public String getname() {
		return name;

	}	

	//set method
	public void setname(String name)
	{
		this.name=name;
	}

	public int getid() {
		return id;
	}
	public void setid(int id)
	{
		this.id=id;

	}
	public long getmobilenumber() {
		return mobilenumber;
	}
	public void setmobilenumber(long mobilenumber)
	{
		this.mobilenumber=mobilenumber;

	}

	public String getaddress() {
		return address; 
	}

	public void setaddress(String address)
	{
		this.address=address;

	}

	public String geteducation() {

		return education;
	}
     public void seteducation(String education)
     {
    	 this.education=education;
     }

     public String getsports()
     {
    	 return sports;
     }
    public void setsports(String sports)
    {
    	this.sports=sports;
    }
}
