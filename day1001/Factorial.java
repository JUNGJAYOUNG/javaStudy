import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n,sum=1;
		System.out.print("정수를 입력하세요:");
		n=input.nextInt();
		//i:1,2,3,4,5
		//i:5,4,3,2,1

		for(int i=n;i>=1;i--){
			sum = sum*i;
			System.out.print(i);
			if(i!=1)
				System.out.print("*");
		}
		System.out.print("="+sum);
	}
}
