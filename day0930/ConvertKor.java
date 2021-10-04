//사용자하넽 0~9사이의 정수 입력받아
//한글표기식으로 출력
import java.util.Scanner;
class ConvertKor
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("0~9사이의 수를 입력하시오:");
		num=input.nextInt();
	
        if(num==0){
		   System.out.println("영");
		}elseif(num==1);{
		   System.out.println("일");
		}elseif(num==2);{
		   System.out.println("이");
		}elseif(num==3);{
		   System.out.println("삼");
		}elseif(num==4);{
		   System.out.println("사");
		}elseif(num==5);{
		   System.out.println("오");
		}elseif(num==6);{
		   System.out.println("육");
		}elseif(num==7);{
		   System.out.println("칠");
		}elseif(num==8);{
		   System.out.println("팔");
		}elseif(num==9);{
		   System.out.println("구");
		}
	}
}
