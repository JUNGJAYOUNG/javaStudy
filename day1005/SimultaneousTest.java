import java.util.Scanner;
class SimultaneousTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int x,result=0;	
		System.out.print("x값을 입력하세요:");
		x=input.nextInt();
		if(x<=0)
			result=x*x*x-9*x+2;
		else
			result=7*x+2;

		System.out.print(result);
	}
}
