import java.util.Scanner;

class ForTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int i=1;
		int sum=0; //�հ� �������� 0���� �ʱ�ȭ
		int n;
		System.out.print("1���� ������� ���ұ��?");
		n= input.nextInt();

		for(i=1 ; i<=n ; i++){
			sum += i;
		}

		/*
		sum += i;
		i++;
		sum += i;
		i++;
		sum += i;
		*/
		System.out.println("1���� "+n+"������ ����"+sum+"�Դϴ�.");

	}
}
