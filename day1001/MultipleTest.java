//문제11번
import java.util.Scanner;
class MultipleTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("정수를 입력하세요:");
		n=input.nextInt();
		if(n<0)
			System.out.println("잘못된 입력입니다.");
		for(int i=1;i<n;i++){
			if(i%3==0)
				System.out.println(i);
		}
	}
}
