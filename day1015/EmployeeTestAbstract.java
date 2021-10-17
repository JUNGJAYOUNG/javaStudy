import java.util.Scanner;

//추상메소드를 포함하고 있기 때문에 추상클래스가 되어야 합니다.
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

	public int getSalary(){	//computeSalary메소드로 salary를 계산하므로 setter는 생략해줌
		return salary;
	}
	
	public abstract void computeSalary();
	//body를 구체화 할 수 없는 메소드는 추상메소드로 만든다.
	//미래에 만들어지는 자식클래스들이 자신에게 알맞도록 반드시 오버라이딩 해야한다!

	public String toString(){
		return "이름:"+name+",사원번호:"+no+",급여:"+salary;
	}

}
class SalariedEmployee extends Employee{
	private int grade; //호봉
	private int base; //기본급
	private int allowance;//수당
	
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
		//호봉에 따라 기본급과 수당을 결정
		//급여 = 기본급 + 수당
		//1호봉부터 3호봉까지 있다고 가정
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
		return super.toString()+",기본급:"+base+",수당:"+allowance;
	}
}

class HourlyEmployee extends Employee{
	private int base;	//시간당 임금
	private int time;	//일한 시간

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
		//급여 = 시간당 임금 * 일한 시간
		salary = base*time;
	}
	
	public String toString(){
		return super.toString()+",시간당임금:"+base+",일한시간:"+time;
	}

}


class EmployeeTestAbstract
{
	public static void main(String[] args) 
	{	
		//상속관계에 있을때 부모클래스의 참조변수가
		//자식클래스의 객체를 참조할 수 있다.
		//사용자한테 월급제 사원인지, 시간제 사원인지 물어보고 데이터를 입력받아 처리
		//부모인 Employee의 참조변수를 사용하면 가능
		
		Employee e1;
		Scanner sc = new Scanner(System.in);
		int type;
		//월급제:1, 시간제:2
		
		String name,no;

		do{
			System.out.print("사원의 종류를 입력하세요. 1:월급제,2:시간제-->");
			type = sc.nextInt();
		}while(type !=1 && type !=2);


		System.out.print("사원의 이름을 입력하세요:");
		name=sc.next();
		
		System.out.print("사원번호를 입력하세요:");
		no=sc.next();
		
		

		if(type==1){
			int grade;
			System.out.print("사원의 호봉을 입력하세요:");
			grade=sc.nextInt();
			e1=new SalariedEmployee(name,no,grade);
		}else{
			int base,time;
			System.out.print("시간당임금을 입력하세요:");
			base=sc.nextInt();
			System.out.print("일한시간을 입력하세요:");
			time=sc.nextInt();
			e1=new HourlyEmployee(name,no,base,time);
		}
/*
		switch(type){
			case 1:
				//String name,String no,int grade;
				int grade;
				System.out.print("사원의 호봉을 입력하세요:");
				grade=sc.nextInt();
				e1=new SalariedEmployee(name,no,grade);
				break;
			default:
				int base,time;
				System.out.print("시간당임금을 입력하세요:");
				base=sc.nextInt();
				System.out.print("일한시간을 입력하세요:");
				time=sc.nextInt();
				e1=new HourlyEmployee(name,no,base,time);
		}//end switch		
*/	
		e1.computeSalary();
		System.out.println(e1);
	}
}
