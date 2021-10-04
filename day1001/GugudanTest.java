import java.util.Scanner;
class GugudanTest  
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.print("구구단 중에 몇단을 출력할까요?");
		a=input.nextInt();
		for(b=1;b<=9;b++){
			System.out.println(a+"*"+b+"="+(a*b));
		}

	}
}
