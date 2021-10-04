//연습)사용자한테 이름과 출생연도를 입력받아 무료암검진 대상자인지 판별하여
//결과를 출력하는 프로그램을 작성하시오.
//<처리조건>
//-무료 암검진 대상자는 나이가 40세 이상이고, 그 해가 짝수연도라면 짝수연도에 태어난 사람
//그 해가 홀수연도라면 홀수연도에 태어난 사람입니다.
//40세이상 암검진 항목은 위암, 간암입니다.
//50세이상이면 암검진 항목은 위암, 간암, 유방암, 자궁암입니다.
import java.util.Scanner;
class AgeTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		int byear,cyear,age;
		System.out.println("이름:");
		name = input.next();
		System.out.println("출생연도:");
		byear = input.nextInt();
		System.out.println("검진연도:");
		cyear = input.nextInt();
		
		age= cyear - byear;

		if (cyear%2==0){
			if(byear%2==0 && age>=40){
				System.out.println("무료암검진 대상자입니다.");
				if(age>=50)
					System.out.println("검진항목은 위암, 간암입니다.");
				else
					System.out.println("검진항목은 위암, 간암, 대장암입니다.");
			}
		}else
			if(byear%2!=0 && age>=40){
				System.out.println("무료암검진 대상자가 아닙니다.");
	
		}

	}
}
