import java.util.Scanner;
class SwitchTest02
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("0~9사이의 수를 입력하시오:");
		n = input.nextInt();//2
		switch(n){
		   case 1:
		   case 0:	//케이스의값의 크기 순서는 상관x
			   System.out.println("일");
		   case 2:
			   System.out.println("이");
			   break;
		   case 3:
			   System.out.println("삼");
		   case 4:
			   System.out.println("사");
		   case 5:
			   System.out.println("오");
			   break;
		   case 6:
			   System.out.println("육");
			   break;
		   case 7:
			   System.out.println("칠");
			   break;
		   case 8:
			   System.out.println("팔");
			   break;
		   case 9:
			   System.out.println("구");
			   break;
		   default:
			   System.out.println("입력범위를 넘었습니다.");
		}
	}
}