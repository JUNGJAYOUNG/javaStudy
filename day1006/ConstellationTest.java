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
		boolean flag=false;
		String yesNo;
		String name;
		int month=0, last=31, day=0;
		String result="";
		
		do{
		
		while(true){
			System.out.print("이름==>");
			name=input.next();
			break;
		}

		while(true){
			System.out.print("생월==>");
			month=input.nextInt();
			if(month>=1 && month<=12){
				break;
			}
		}

		//달별 마지막날 계산
		if(month==2){
			last=28;
		}else if(month==4 || month==6 || month==9 || month==11){
			last=30;		
		}

		while(true){
			System.out.print("생일==>");
			day=input.nextInt();
			if(day>=1 && day<=last){
				break;
			}
		}
			
		
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
			}
			System.out.println(name+"님의 별자리는"+result+"자리입니다.");
			
			do{
				System.out.print("또하시겠어요?(y/n)==>");
				yesNo = input.next();
				if (yesNo.charAt(0)=='y'||yesNo.charAt(0)=='Y'){
					flag=true;
				}else if(yesNo.charAt(0)=='n'||yesNo.charAt(0)=='N'){
					flag=false;
				}else{
					//모르겠다..
				}
				if(flag==false || flag==true)
					break;
			}while(true);
			if(flag!=true)
				break;
		}while(true);
	}
}
