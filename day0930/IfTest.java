//��������� ������ �� n�� �Է¹޾� n�� ����̸�
//�� ���� 100�� ���� ���� ����� ���� "�۾�����"�� ����ϰ�
//�׷��� ������ �� ���� ������ ����� ���� 
//"�۾�����"�� ���
import java.util.Scanner;
class IfTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        int n;
		
		System.out.println("������ ���� �Է��ϼ���.");
		n=input.nextInt();
		
		if (n>=0)
		{
			System.out.println(n+100);
		}else{
			System.out.println(n*n);
		}
		System.out.println("�۾�����");
	}
}