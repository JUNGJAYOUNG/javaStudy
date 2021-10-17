class Dept{
	private int number;
	private String name;
	private String address;

	public Dept(int number,String name,String address){
		this.number=number;
		this.name=name;
		this.address=address;
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

class DeptTest02{

	public static void main(String[] args){

		Dept d1;
	
		d1=new Dept(10,"�ѹ���","����"); 
		Dept d2=new Dept(20,"������","����");

		System.out.println(d1);
		System.out.println(d2);

	}
}
