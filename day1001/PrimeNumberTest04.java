import java.util.Scanner;
class PrimeNumberTest04
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int i,n;
		System.out.print("n�� �Է��ϼ���:");
		n=input.nextInt();

		for(i=2;i<n;i++){
			if(n%i==0){
				break;
			}
		}
		if(i==n){
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else{
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
