import java.util.Scanner;
class ForTest02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n,sum=0; //n�� ����ڷκ��� �Է¹ޱ� ������ �� �ʱ�ȭ���� �ʾƵ� ������
					 //sum�� �ݺ������� ������ �ϱ� ������ �ݵ�� �ʱⰪ�� �־�� ��.
					 //������ ���ϱ⸦ �� ���̶� 0���� �ʱ�ȭ��
					 //�־��� �����ذ��� ���Ͽ� �׶��׶����� ������ ������ �ʱ�ȭ �ؾ���.

		System.out.print("1���� ������� ���ұ��?");
		n=input.nextInt();
		for(int i=1;i<=n;i++){
			sum+=i;
		}

		System.out.print("1����"+n+"������ ����" +sum+"�Դϴ�.");
	}
}