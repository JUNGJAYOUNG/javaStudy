import java.util.Scanner;
class PriceTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		int num;
		double price;
		System.out.print("구매한 물건의 개수를 입력하세요:");
		num=input.nextInt();
		
		if(num>=10)
			price=(num*100)*0.9;
		else
			price=num*100;

		System.out.println("전체가격은"+(int)price+"원입니다.");

	}
}
