class Department{
	private int number;
	private String name;
	private String address;

	public Department(){
		number=001;
		name="�ѹ���";
		address="����";
	}

	//��� ���� name�� ���� ����(����)�ϴ� �޼ҵ带 ����
	public void setNumber(int n){
		this.number = n;	//����������� �Ű������� �켱������ ����
	}

	public int getNumber(){
		return number; //���ϰ��� �ִ�
	}
	
	
	public void setName(String n){
		this.name = n;	//����������� �Ű������� �켱������ ����
	}

	public String getName(){
		return name; //���ϰ��� �ִ�
	}
	
	public void setAddress(String n){
		this.address = n;
	}
	public String getAddress(){
		return address;
	}

	public String toString(){
		String result = "";
		result += "�μ���ȣ:"+this.number+"\n";
		result += "�μ���:"+this.name+"\n";
		result += "�μ���ġ:"+this.address+"\n";
		return result;
	}

}

class DepartmentTest{

	public static void main(String[] args){

		Department d1;

		d1=new Department(); 

		System.out.println(d1);
		d1.setNumber(002);
	    d1.setName("������");
		
		System.out.println(d1);

	}
}
