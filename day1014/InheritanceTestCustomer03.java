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
	
	public void setMileage(double mileage){
		this.mileage=mileage;
	}

	public double getMileage(){
		return mileage;
	}

	public void printCustomer(){ 
		System.out.printf("���̸�:%s\n",c.getName());	//��ӹ��� �ڽ�Ŭ������ �θ��� private�������� ����xx
		System.out.printf("���ּ�:%s\n",c.getAddr());
		System.out.printf("����ȭ:%s\n",c.getPhone());
		System.out.printf("����ȣ:%s\n",number);
		System.out.printf("���ϸ���:%.1f\n",mileage);
	}

}

class InheritanceTestCustomer03{
	public static void main(String[] args) 
	{
		c.setName("ȫ�浿");
		c.setAddr("����� ������ ������");
		c.setPhone("010-1234-3423");
		c.setNumber("A123");
		c.setMileage(100);
		
		c.printCustomer();
	}

}
