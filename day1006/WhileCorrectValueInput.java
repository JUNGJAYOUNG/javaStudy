import java.util.Scanner;
class WhileCorrectValueInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month=-1;
		
		do{
			System.out.print("월을 입력하세요:");
			month = sc.nextInt();
		}while(month<1 || month>12);

		/*
		while(month <1 || month >12){
			System.out.print("월을 입력하세요:");
			month = sc.nextInt();
		}
		*/

		//제대로 입력받을때까지 입력받기
		/*
		for(;;){
			System.out.print("월을 입력하세요:");
			month = sc.nextInt();
			if(month>=1 && month<=12){
				break;
			}
		}
		*/
		/*
		while(true){
			System.out.print("월을 입력하세요:");
			month = sc.nextInt();
			if(month>=1 && month<=12){
				break;
			}
		}
		*/

		String name="";
		if(month>=3 && month<=5){
			name="봄";
		}else if(month>=6 && month <=8){
			name="여름";
		}else if(month>=9 && month <=11){
			name="가을";
		}else{
			name="겨울";
		}

		System.out.printf("%d월은 %s입니다.",month,name);
	}

}
