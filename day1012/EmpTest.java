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

	//멤버 변수 name의 값을 설정(변경)하는 메소드를 정의
	public void setNumber(int n){
		this.number = n;	//멤버변수보다 매개변수가 우선순위가 높다
	}

	public int getNumber(){
		return number; //리턴값이 있다
	}
	
	
	public void setName(String n){
		this.name = n;	//멤버변수보다 매개변수가 우선순위가 높다
	}

	public String getName(){
		return name; //리턴값이 있다
	}
	
	public void setSalary(int n){
		this.salary = n;
	}
	public int getSalary(){
		return salary;
	}

	public String toString(){
		String result = "";
		result += "사원번호:"+this.number+"\n";
		result += "사원명:"+this.name+"\n";
		result += "급여:"+this.salary+"\n";
		result += "입사일:"+this.date+"\n";
		result += "부서명:"+this.dept+"\n";
		return result;
	}

}

class EmpTest{

	public static void main(String[] args){

		Employee e1=new Employee(201632030,"정자영",3400,"2022/04/01","개발팀");
		Employee e2=new Employee(201732030,"김유신",3500,"2022/05/01","전산팀");
		System.out.println(e1);
		System.out.println(e2);
		

	}
}
