import java.util.Scanner;

class FindMin 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�ΰ��� ������ �Է��ϼ���.");
		int a=input.nextInt();
		int b=input.nextInt();

		int min=(a<b)?a:b;

		System.out.println("���� ����"+min);
	}
}
