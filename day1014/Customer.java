class Person
{
	String name;
	String address;
	String phone;
}

class Customer extends Person{
	int number;
	int point;

	public static void main(String[] args) 
	{
		Customer cu = new Customer();

		cu.name="정자영";
		cu.address="서대문구";
		cu.phone="010-8757-7894";
		cu.number=123;
		cu.point=100;
		System.out.println(cu.name);
		System.out.println(cu.address);
		System.out.println(cu.phone);
		System.out.println(cu.number);
		System.out.println(cu.point);
	
	}

}
