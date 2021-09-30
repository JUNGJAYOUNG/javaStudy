//사용자한테 두개의 정수를 입력받아 그 중에 작은 수를
//출력하는 프로그램 작성
import java.util.Scanner;
class MinTest 
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		int a,b,min;
		System.out.println("두 개의 정수를 입력하세요.");
		a=input.nextInt();
		b=input.nextInt();
		
		if (a>b)
		   min=b;
		else
		   min=a;
		
		System.out.println("작은 수:"+min);
		
	}
}
