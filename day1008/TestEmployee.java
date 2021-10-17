import java.util.Scanner;
class Employee
{	
	String name;	//이름
	String addr;	//주소
	int salary;		//연봉
	String phone;	//전화번호

}

class TestEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee []emp = new Employee[5];	//배열 참조변수 선언 및 배열 생성
		
		for(int i=0;i<emp.length;i++){
			emp[i] = new Employee();	//객체 생성
			System.out.printf("%d번째 사원의 이름:",i+1);
			emp[i].name=sc.next();
			System.out.printf("%d번째 사원의 주소:",i+1);
			emp[i].addr=sc.next();
			System.out.printf("%d번째 사원의 연봉:",i+1);
			emp[i].salary=sc.nextInt();
			System.out.printf("%d번째 사원의 전화번호:",i+1);
			emp[i].phone=sc.next();

		}

		System.out.println("******사원 정보*****");
		System.out.println("이름\t주소\t연봉\t전화번호");
		for(int i=0;i<emp.length;i++){
			
			System.out.printf("%s\t%s\t%d\t%s\n"
				,emp[i].name,emp[i].addr,emp[i].salary,emp[i].phone);
			
		}
	}
}
