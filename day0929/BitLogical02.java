import java.util.Scanner;
class BitLogical02
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("두사람의 나이를 입력하세요.");
		int age1=input.nextInt();
		int age2=input.nextInt();

		if(++age1>=20 && ++age2>=20)
			System.out.println("두사람의 나이를 1씩 증가하면 두사람 모두 스무살 이상입니다.");
		else
			System.out.println("두사람의 나이를 1씩 증가하면 두사람 모두 스무살 이상은 아닙니다.");
		
		System.out.println("age1:"+age1);
		System.out.println("age2:"+age2);
	
	}
}
