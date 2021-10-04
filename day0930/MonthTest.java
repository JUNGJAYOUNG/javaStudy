import java.util.Scanner;
class MonthTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int month,day=31;
		System.out.print("월을 입력하세요:");
		month=input.nextInt();
		if(month>12 || month<1){
			System.out.println("잘못된 입력입니다.");
		}else{	
			if(month==2){
				day=28;
			}else if(month==4 || month==6 || month==9 || month==11){
				day=30;		
			}
			System.out.println(month+"월은 "+day+"일까지 있어요!");
		}
			
	}
		
}
