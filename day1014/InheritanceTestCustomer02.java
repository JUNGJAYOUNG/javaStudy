class Person
{
	private String name;
	private String addr;
	private String phone;

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}
	
	public void setAddr(String addr){
		this.addr=addr;
	}

	public String getAddr(){
		return addr;
	}
	
	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return phone;
	}
}

class Customer extends Person
{
	private String number;
	private double mileage;
	
	public void setNumber(String number){
		this.number=number;
	}

	public String getNumber(){
		return number;
	}
	
	public void setMileage(String mileage){
		this.mileage=mileage;
	}

	public String getMileage(){
		return mileage;
	}
	
}

class InheritanceTestCustomer02{
	public static void main(String[] args) 
	{
		c.setName("ȫ�浿");
		c.setAddr("����� ������ ������");
		c.setPhone("010-1234-3423");
		c.setNumber("A123");
		c.setMileage(100);
		System.out.printf("���̸�:%s\n",c.getName());
		System.out.printf("���ּ�:%s\n",c.getAddr());
		System.out.printf("����ȭ:%s\n",c.getPhone());
		System.out.printf("����ȣ:%s\n",c.getNumber());
		System.out.printf("���ϸ���:%.1f\n",c.getMileage());
		
	}

}
