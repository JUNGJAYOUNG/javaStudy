//연습) 사용자한테 임의의 n을 입력받아 그 수가 6의 배수인지
//판별하여 논리값을 출력
import java.util.Scanner;
class Check6
{
	public static void main(String[] args) 
	{
		int a;
		boolean flag;
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		a = input.nextInt();

		if (a % 6 == 0)
			flag = true;
		else
			flag = false;

		System.out.println("6의 배수 여부"+flag);
	}
}
