import java.util.Scanner;
class PrimeNumberTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n,cnt=0;
		System.out.print("n�� �Է��ϼ���:");
		n=input.nextInt();
		
		for(int i=1;i<=n;i++){
			if(n%i==0)	//�������� �������� 0�� �Ǵ� ��(���)			
				cnt++;  
		}
		if(cnt==2)	//����� 2����� => �Ҽ����
			System.out.print(n+"�� �Ҽ��Դϴ�.");
		else
			System.out.print(n+"�� �Ҽ��� �ƴմϴ�.");
	}
}
