import java.util.Scanner;
class CalTest01 
{
	public static void main(String[] args) 
	{
		int data;
		int div1,div2,div3,div4;//몫
		int res1,res2,res3;//나머지
		Scanner input = new Scanner(System.in);
		
		System.out.print("1000미만의 정수를 입력하시오:");
		data = input.nextInt();

		div1=data/1000;
		res1=data%1000;
		System.out.println("천의 자리:"+div1);
		div2=res1/100;
		res2=res1%100;
		System.out.println("백의 자리:"+div2);
		div3=res2/10;
		res3=res2%10;
		System.out.println("십의 자리:"+div3);
		System.out.println("일의 자리:"+res3);
	}
}
