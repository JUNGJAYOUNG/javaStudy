import java.util.Scanner;
class AgeTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�λ���� ���̸� �Է��ϼ���.");
		int age1=input.nextInt();
		int age2=input.nextInt();

		if(age1>=20 & age2>=20)
			System.out.println("�λ�� ��� �����Դϴ�");

	}
}
