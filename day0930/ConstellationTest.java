 /* 사용자한테 생월과 생일을 입력받아
 별자리를 판별하여 출력하는 프로그램을 작성해본다.

 이름==>윤태인
 생월==>2
 생일==>9
 윤태인님의 별자리는 물병자리입니다.
 */
import java.util.Scanner;
class ConstellationTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		int month, last=31, day;
		String result="";
		boolean flag=true;

		System.out.print("이름==>");
		name=input.next();
		System.out.print("생월==>");
		month=input.nextInt();
		System.out.print("생일==>");
		day=input.nextInt();
		
		//달별 마지막날 계산
		if(month==2){
			last=28;
		}else if(month==4 || month==6 || month==9 || month==11){
			last=30;		
		}
		//입력한 일자가 범위 벗어날 경우
		if(day>last || day<1){
			System.out.println(month+"월은 "+last+"일까지 있어요!");
			flag=false;
		}else{
			
			switch(month){
				case 1:
					if(day<=19)
					   result="염소";
					else
					   result="물병";
					break;
				case 2:
					if(day<=19)
					   result="물병";
					else
					   result="물고기";
					break;
				case 3:
					if(day<=21)
					   result="물고기";
					else
					   result="양";
					break;
				case 4:
					if(day<=19)
					   result="양";
					else
					   result="황소";
					break;
				case 5:
					if(day<=19)
					   result="황소";
					else
					   result="쌍둥이";
					break;
				case 6:
					if(day<=19)
					   result="쌍둥이";
					else
					   result="게";
					break;
				case 7:
					if(day<=19)
					   result="게";
					else
					   result="사자";
					break;
				case 8:
					if(day<=19)
					   result="사자";
					else
					   result="처녀";
					break;
				case 9:
					if(day<=19)
					   result="처녀";
					else
					   result="천칭";
					break;
				case 10:
					if(day<=19)
					   result="천칭";
					else
					   result="전갈";
					break;
				case 11:
					if(day<=19)
					   result="전갈";
					else
					   result="사수";
					break;
				case 12:
					if(day<=19)
					   result="사수";
					else
					   result="염소";
					break;
				default:
					System.out.println("잘못된 입력입니다."); //월을 1~12이외의 숫자를 입력했을 경우
				
			}
			if(flag)
				System.out.println(name+"님의 별자리는 "+result+"자리입니다.");

		}
	}
}
