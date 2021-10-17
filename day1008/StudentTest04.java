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

class StudentTest04
{
	public static void main(String[] args) 
	{
		Student []s = new Student[1];		//Student의 객체를 생성한 것은 아니고
											//Student의 객체를 참조할 수 있는 변수 2개를 만든것.
		s[0] = new Student();
		s[0].name = "홍길동";
		System.out.println(s[0].name);
	}	
}
