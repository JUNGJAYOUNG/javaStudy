import java.util.Scanner;
class DoWhile01 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("N을 입력하세요:");
		n = input.nextInt();
		int i=0,sum=0;
		do{
			i++;
			sum+=i;
		}while(i<n);
		System.out.println(sum);
	}
}
