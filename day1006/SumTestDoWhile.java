import java.util.Scanner;
class SumTestDoWhile
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n,sum=0;
		System.out.println("N�� �Է��ϼ���:");
		n = input.nextInt();
		int i=1;
		do{
			sum+=i;
			i++;
		}while(i<=n);
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",n,sum);
	}
}
