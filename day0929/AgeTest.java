import java.util.Scanner;
class AgeTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("두사람의 나이를 입력하세요.");
		int age1=input.nextInt();
		int age2=input.nextInt();

		if(age1>=20 & age2>=20)
			System.out.println("두사람 모두 성인입니다");

	}
}
