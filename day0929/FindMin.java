import java.util.Scanner;

class FindMin 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요.");
		int a=input.nextInt();
		int b=input.nextInt();

		int min=(a<b)?a:b;

		System.out.println("작은 수는"+min);
	}
}
