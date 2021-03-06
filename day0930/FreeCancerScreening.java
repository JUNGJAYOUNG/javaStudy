//연습)사용자한테 이름과 출생연도를 입력받아 무료암검진 대상자인지 판별하여
//결과를 출력하는 프로그램을 작성하시오.
//<처리조건>
//-무료 암검진 대상자는 나이가 40세 이상이고, 그 해가 짝수연도라면 짝수연도에 태어난 사람
//그 해가 홀수연도라면 홀수연도에 태어난 사람입니다.
//40세이상 암검진 항목은 위암, 간암입니다.
//50세이상이면 암검진 항목은 위암, 간암, 유방암, 자궁암입니다.

import java.util.Scanner;
import java.util.Date; //올해 연도를 알기 위해서 
class FreeCancerScreening 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Date today = new Date();
		String name;
		String items = "";
		int userYear,age,thisYear;
		thisYear = today.getYear()+1900; //올해 연도 읽어오기

	    System.out.print("이름:");
		name = input.next();
		System.out.println("출생연도:");
		userYear = input.nextInt();
		
		age= thisYear - userYear;
		
		System.out.println(name +"님,올해에"+age+"살 입니다.");
		if (age>=40 && thisYear%2==userYear%2){
			items="위암,간암";
			if(age>=50){
				items=items+",대장암";
			}
			System.out.println(name+"님"+thisYear+"에 무료암검진 대상자입니다.");
			System.out.println("암검진 항목은"+items+" 입니다.");
		}else{
			System.out.println(name+"님"+thisYear+"에는 무료암검진 대상자가 아닙니다.");
		}
	}
}
