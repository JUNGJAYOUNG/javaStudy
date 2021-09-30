import java.util.Scanner;
class AgeSame 
{
	public static void main(String[] args) 
	{
		int age1,age2;
		Scanner input = new Scanner(System.in);
		System.out.println("비교하고 싶은 두사람의 나이를 입력하세요.");
		age1=input.nextInt();
		age2=input.nextInt();
		
		if(age1==age2)
			System.out.println("동갑입니다.");
		else
			System.out.println("동갑이 아닙니다.");
	}
}
