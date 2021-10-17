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
		e.setSalary(e.getHourSal()*e.getTime());	//월급 계산=일한시간*시간당임금
	}

	public String toString(){
		return "이름:"+name+",사번:"+number;
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
		return super.toString()+",월급:"+salary;
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
		return super.toString()+",시간당월급:"+hourSal+",일한시간:"+time;
	}

}


class EmployeeTest 
{
	public static void main(String[] args) 
	{	
		Employee e1 = new Employee("송서현",8594);
		SalariedEmployee e2=new SalariedEmployee("정자영",1234,1000);
		HourlyEmployee e3=new HourlyEmployee("홍길동",84221,2000,1000,2);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		
	}
}
