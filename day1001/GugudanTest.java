import java.util.Scanner;
class GugudanTest  
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.print("������ �߿� ����� ����ұ��?");
		a=input.nextInt();
		for(b=1;b<=9;b++){
			System.out.println(a+"*"+b+"="+(a*b));
		}

	}
}
