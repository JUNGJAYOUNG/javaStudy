import java.util.Scanner;
class PrimeNumberTest02
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n,cnt=0;
		boolean flag = true;
		System.out.print("n�� �Է��ϼ���:");
		n=input.nextInt();
		
		for(int i=2;i<n;i++){
			if(n%i==0)
				flag = false;
		}
		if(flag){
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else{
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
