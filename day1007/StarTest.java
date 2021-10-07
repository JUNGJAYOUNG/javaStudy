 /* 사용자한테 생월과 생일을 입력받아
 별자리를 판별하여 출력하는 프로그램을 작성해본다.

 이름==>윤태인
 생월==>2
 생일==>9
 윤태인님의 별자리는 물병자리입니다.
 */
import java.util.Scanner;
class StarTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name,result="";
		int month=0, day=0;
		int []last ={31,28,31,30,31,30,31,31,30,31,30,31};
		char again;

		do{
			System.out.print("이름==>");
			name=input.next();
			
			do{
				System.out.print("생월==>");
				month=input.nextInt();
			}while(month<1 || month>12);
				
			do{
				System.out.print("생일==>");
				day=input.nextInt();
			}while(day<1 || day> last[month-1]);
			
			switch(month){
				case 1:
					if(day<=19) result="염소"; else result="물병";break;
				case 2:
					if(day<=18) result="물병"; else result="물고기";break;
				case 3:
					if(day<=20) result="물고기"; else result="양";break;
				case 4:
					if(day<=19) result="양"; else result="황소";break;
				case 5:
					if(day<=20) result="황소"; else result="쌍둥이";break;
				case 6:
					if(day<=21) result="쌍둥이"; else result="게";break;
				case 7:
					if(day<=22) result="게"; else result="사자";break;
				case 8:
					if(day<=22) result="사자"; else result="처녀";break;
				case 9:
					if(day<=23) result="처녀"; else result="천칭";break;
				case 10:
					if(day<=22) result="천칭"; else result="전갈";break;
				case 11:
					if(day<=22) result="전갈"; else result="사수";break;
				case 12:
					if(day<=24) result="사수"; else result="염소";break;
				}

				System.out.printf("%s님의 별자리는 %s자리입니다.\n",name,result); //%s string
				
				do{
					System.out.print("또, 하시겠어요?(y/n)");
					again = input.next().charAt(0);
				}while(again!='y' && again!='n' && again!='Y' && again!='N'); //대답을 잘못한 경우 계속 다시 물어봄

			}while(again=='y' || again=='Y');
		
		System.out.println("종료합니다.");
	}
}
