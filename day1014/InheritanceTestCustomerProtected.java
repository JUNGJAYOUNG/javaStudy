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
		System.out.printf("고객이름:%s\n",c.getName());	//상속받은 자식클래스도 부모의 private영역에는 접근xx
		System.out.printf("고객주소:%s\n",c.getAddr());
		System.out.printf("고객번호:%s\n",number);
	}

}

class InheritanceTestCustomerProtected extends Customer{
	public static void main(String[] args) 
	{
		c.setName("홍길동");
		c.setAddr("서울시 마포구 서교동");
		c.setNumber("A123");
		
		c.printCustomer();
	}

}
