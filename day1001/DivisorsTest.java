import java.util.Scanner;
class DivisorsTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("n을 입력하세요:");
		n=input.nextInt();
		
		for(int i=1;i<=n;i++){
			if(n%i==0)
				System.out.print(i+ " ");
		}
	}
}
