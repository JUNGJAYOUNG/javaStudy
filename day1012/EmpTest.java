class Employee{
	private int number;
	private String name;
	private int salary;
	private String date;
	private String dept;

	public Employee(int number,String name,int salary,String date,String dept){
		this.number=number;
		this.name=name;
		this.salary=salary;
		this.date=date;
		this.dept=dept;
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
	
	public void setSalary(int n){
		this.salary = n;
	}
	public int getSalary(){
		return salary;
	}

	public String toString(){
		String result = "";
		result += "�����ȣ:"+this.number+"\n";
		result += "�����:"+this.name+"\n";
		result += "�޿�:"+this.salary+"\n";
		result += "�Ի���:"+this.date+"\n";
		result += "�μ���:"+this.dept+"\n";
		return result;
	}

}

class EmpTest{

	public static void main(String[] args){

		Employee e1=new Employee(201632030,"���ڿ�",3400,"2022/04/01","������");
		Employee e2=new Employee(201732030,"������",3500,"2022/05/01","������");
		System.out.println(e1);
		System.out.println(e2);
		

	}
}
