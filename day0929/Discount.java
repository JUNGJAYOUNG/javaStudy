import java.util.Scanner;
class Discount 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		int count, price;
		int pay;
		
		System.out.print("상품명을 입력하세요:");
		name = input.next();
		System.out.print("단가를 입력하세요:");
		price = input.nextInt();
		System.out.print("구매수량을 입력하세요:");
		count = input.nextInt();
		
		pay=price*count;
		
		if (count>=10 || pay >= 20000)
			pay = (int)(pay*0.9);
	
		System.out.println("지급금액:"+pay);
	}
}
