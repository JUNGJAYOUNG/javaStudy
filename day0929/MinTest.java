//��������� �ΰ��� ������ �Է¹޾� �� �߿� ���� ����
//����ϴ� ���α׷� �ۼ�
import java.util.Scanner;
class MinTest 
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		int a,b,min;
		System.out.println("�� ���� ������ �Է��ϼ���.");
		a=input.nextInt();
		b=input.nextInt();
		
		if (a>b)
		   min=b;
		else
		   min=a;
		
		System.out.println("���� ��:"+min);
		
	}
}
