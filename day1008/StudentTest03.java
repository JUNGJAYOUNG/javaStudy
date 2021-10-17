import java.util.Scanner;
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}

class StudentTest03
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Student s;
		s = new Student();	//객체를 생성하는 문장
		s.name="홍길동";
		System.out.println(s.name);
	}	
}
