import java.util.Scanner;
class WhileTest03
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n,sum=1;
		System.out.print("N을 입력하세요:");
		n = input.nextInt();
		
		int i=n;
		while(i>=1){
			System.out.print(i);
			if(i!=1){
				System.out.print("*");
			}
			sum*=i;
			i--;
		}
		System.out.printf("=%d",sum);
	}
}
