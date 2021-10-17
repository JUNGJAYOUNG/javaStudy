class Employee{
	protected String name;
	protected int number;
	public Employee(String name,int number){
		this.name=name;
		this.number=number;
	}
	public Employee(){
		
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return number;
	}
	public void computeSalary(Employee e){
		e.setSalary(e.getHourSal()*e.getTime());	//���� ���=���ѽð�*�ð����ӱ�
	}

	public String toString(){
		return "�̸�:"+name+",���:"+number;
	}


}
class SalariedEmployee extends Employee{
	private int salary;
	
	public SalariedEmployee(String name,int number,int salary){
		super(name,number);
		this.salary=salary;
	}
	public SalariedEmployee(){
		
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	public int getSalary(){
		return salary;
	}
	public void computeSalary(Employee e){
		e.setSalary(e.getHourSal()*e.getTime());
	}
	public String toString(){
		return super.toString()+",����:"+salary;
	}
}

class HourlyEmployee extends Employee{
	private int hourSal;
	private int time;

	public HourlyEmployee(String name,int number,int hourSal,int time){
		super(name,number);
		this.hourSal=hourSal;
		this.time=time;
	}
	public HourlyEmployee(){
		
	}
	
	public void setHourSal(int hourSal){
		this.hourSal=hourSal;
	}
	public int getHourSal(){
		return hourSal;
	}
	public void setTime(int time){
		this.time=time;
	}
	public int getTime(){
		return time;
	}
	public void computeSalary(Employee e){
		e.setSalary(hourSal*time);
	}
	public String toString(){
		return super.toString()+",�ð������:"+hourSal+",���ѽð�:"+time;
	}

}


class EmployeeTest 
{
	public static void main(String[] args) 
	{	
		Employee e1 = new Employee("�ۼ���",8594);
		SalariedEmployee e2=new SalariedEmployee("���ڿ�",1234,1000);
		HourlyEmployee e3=new HourlyEmployee("ȫ�浿",84221,2000,1000,2);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		
	}
}
