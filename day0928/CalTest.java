//연습)사용자한테 두 개의 정수를 입력받아 
//사칙연산을 수행한 결과를 다음과 같이 출력하는 프로그램을 작성하시오.
import java.util.Scanner;
class CalTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int add,sub,multi,div,mode;
		System.out.print("첫번째 수를 입력하시오:");
		a = input.nextInt();

		System.out.print("두번째 수를 입력하시오:");
		b = input.nextInt();

		add = a+b;
		sub = a-b;
		multi = a*b;
		div = a/b;
		mode = a%b;
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"x"+b+"="+multi);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+mode);
		
	}
}
