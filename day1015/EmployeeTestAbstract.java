import java.util.Scanner;

//�߻�޼ҵ带 �����ϰ� �ֱ� ������ �߻�Ŭ������ �Ǿ�� �մϴ�.
abstract class Employee{
	protected String name;
	protected String no;
	protected int salary;

	public Employee(String name,String no){
		this.name=name;
		this.no=no;	
	}
	public Employee(){
		
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setNo(String no){
		this.no=no;
	}
	public String getNo(){
		return no;
	}

	public int getSalary(){	//computeSalary�޼ҵ�� salary�� ����ϹǷ� setter�� ��������
		return salary;
	}
	
	public abstract void computeSalary();
	//body�� ��üȭ �� �� ���� �޼ҵ�� �߻�޼ҵ�� �����.
	//�̷��� ��������� �ڽ�Ŭ�������� �ڽſ��� �˸µ��� �ݵ�� �������̵� �ؾ��Ѵ�!

	public String toString(){
		return "�̸�:"+name+",�����ȣ:"+no+",�޿�:"+salary;
	}

}
class SalariedEmployee extends Employee{
	private int grade; //ȣ��
	private int base; //�⺻��
	private int allowance;//����
	
	public SalariedEmployee(String name,String no,int grade){
		super(name,no);
		this.grade=grade;
	}
	public SalariedEmployee(){
	}

	public void setGrade(int grade){
		this.grade=grade;
	}
	public int getGrade(){
		return grade;
	}
	public void setBase(int base){
		this.base=base;
	}
	public int getBase(){
		return base;
	}
	public void setAllowance(int allowance){
		this.allowance=allowance;
	}
	public int getAllowance(){
		return allowance;
	}
	public void computeSalary(){
		//ȣ���� ���� �⺻�ް� ������ ����
		//�޿� = �⺻�� + ����
		//1ȣ������ 3ȣ������ �ִٰ� ����
		//1: 200,50
		//2: 250,80
		//3: 300,100

		switch(grade){
			case 1:base=200;allowance=50;break;
			case 2:base=250;allowance=80;break;
			case 3:base=300;allowance=100;break;	
		}
		salary = base + allowance;
	}
	public String toString(){
		return super.toString()+",�⺻��:"+base+",����:"+allowance;
	}
}

class HourlyEmployee extends Employee{
	private int base;	//�ð��� �ӱ�
	private int time;	//���� �ð�

	public HourlyEmployee(String name,String no,int base,int time){
		super(name,no);
		this.base=base;
		this.time=time;
	}
	public HourlyEmployee(){
		
	}
	
	public void setBase(int base){
		this.base=base;
	}
	public int getBase(){
		return base;
	}
	public void setTime(int time){
		this.time=time;
	}
	public int getTime(){
		return time;
	}
	public void computeSalary(){
		//�޿� = �ð��� �ӱ� * ���� �ð�
		salary = base*time;
	}
	
	public String toString(){
		return super.toString()+",�ð����ӱ�:"+base+",���ѽð�:"+time;
	}

}


class EmployeeTestAbstract
{
	public static void main(String[] args) 
	{	
		//��Ӱ��迡 ������ �θ�Ŭ������ ����������
		//�ڽ�Ŭ������ ��ü�� ������ �� �ִ�.
		//��������� ������ �������, �ð��� ������� ����� �����͸� �Է¹޾� ó��
		//�θ��� Employee�� ���������� ����ϸ� ����
		
		Employee e1;
		Scanner sc = new Scanner(System.in);
		int type;
		//������:1, �ð���:2
		
		String name,no;

		do{
			System.out.print("����� ������ �Է��ϼ���. 1:������,2:�ð���-->");
			type = sc.nextInt();
		}while(type !=1 && type !=2);


		System.out.print("����� �̸��� �Է��ϼ���:");
		name=sc.next();
		
		System.out.print("�����ȣ�� �Է��ϼ���:");
		no=sc.next();
		
		

		if(type==1){
			int grade;
			System.out.print("����� ȣ���� �Է��ϼ���:");
			grade=sc.nextInt();
			e1=new SalariedEmployee(name,no,grade);
		}else{
			int base,time;
			System.out.print("�ð����ӱ��� �Է��ϼ���:");
			base=sc.nextInt();
			System.out.print("���ѽð��� �Է��ϼ���:");
			time=sc.nextInt();
			e1=new HourlyEmployee(name,no,base,time);
		}
/*
		switch(type){
			case 1:
				//String name,String no,int grade;
				int grade;
				System.out.print("����� ȣ���� �Է��ϼ���:");
				grade=sc.nextInt();
				e1=new SalariedEmployee(name,no,grade);
				break;
			default:
				int base,time;
				System.out.print("�ð����ӱ��� �Է��ϼ���:");
				base=sc.nextInt();
				System.out.print("���ѽð��� �Է��ϼ���:");
				time=sc.nextInt();
				e1=new HourlyEmployee(name,no,base,time);
		}//end switch		
*/	
		e1.computeSalary();
		System.out.println(e1);
	}
}
