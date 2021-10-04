import java.util.Scanner;
class SeasonTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int month;
		System.out.print("월을 입력하세요:");
		month = input.nextInt();
		if(month >12 || month< 1){
			System.out.println("잘못된 입력입니다.");
		}else{
			if(month >=3 && month<=5){
				System.out.println("봄");	
			}else if(month >=6 && month<=8){
				System.out.println("여름");
			}else if(month >=9 && month<=11){
				System.out.println("가을");
			}else if(month ==12 || month==1 || month==2){
				System.out.println("겨울");
			}
		}
	}
}
