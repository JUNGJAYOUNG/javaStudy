import java.util.Scanner;
class SeasonTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int month;
		String sea=""; //String 초기화 시켜줘야함 안해주면 에러남
		System.out.print("월을 입력하세요:");
		month = input.nextInt();
		
		if(month>12 || month<1){
			System.out.println("잘못된 입력입니다.");
		}else{
			
			switch(month){
				case 3: 
				case 4:
				case 5:
					sea="봄";
					break;
				case 6: 
				case 7: 
				case 8:
					sea="여름";
					break;
				case 9: 
				case 10: 
				case 11:
					sea="가을";
					break;
				case 12:
				case 1: 
				case 2: 
					sea="겨울";
					break;
			}
			System.out.println(month+"월은"+sea+"입니다.");
		}
		
	}
}
