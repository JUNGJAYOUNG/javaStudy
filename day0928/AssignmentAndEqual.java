class AssignmentAndEqual 
{
	public static void main(String[] args) 
	{
		//자바 프로그램에서는 대입(assign)연산자와
		//같은지 비교(equal)의 연산자가 다름
		//= 은 대입을 위한 연산자
		//==은 같은지 비교하는 연산자

		int age;
		boolean flag;
		
		//age에 20이라는 값을 대입
		age = 20;
		
		//age의 값이 20과 같은지 비교하여 논리값을 flag에 대입
		flag = age == 20;

		System.out.println(age);
		System.out.println(flag);

	}
}
