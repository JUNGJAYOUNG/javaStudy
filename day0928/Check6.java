//����) ��������� ������ n�� �Է¹޾� �� ���� 6�� �������
//�Ǻ��Ͽ� ������ ���
import java.util.Scanner;
class Check6
{
	public static void main(String[] args) 
	{
		int a;
		boolean flag;
		Scanner input = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		a = input.nextInt();

		if (a % 6 == 0)
			flag = true;
		else
			flag = false;

		System.out.println("6�� ��� ����"+flag);
	}
}
