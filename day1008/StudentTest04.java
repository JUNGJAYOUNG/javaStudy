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
		Student []s = new Student[1];		//Student�� ��ü�� ������ ���� �ƴϰ�
											//Student�� ��ü�� ������ �� �ִ� ���� 2���� �����.
		s[0] = new Student();
		s[0].name = "ȫ�浿";
		System.out.println(s[0].name);
	}	
}