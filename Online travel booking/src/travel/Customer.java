package travel;

public class Customer {
	private String name;
	private int age;
	private String gender;
	Customer(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	void CustDetails()
	{
		System.out.println("*********Customer***********");
		System.out.println("Customer Name : "+this.name);
		System.out.println("Customer Age : "+this.age);
		System.out.println("Customer Gender : "+this.gender);
	}
}
