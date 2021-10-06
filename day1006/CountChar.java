import java.util.Scanner;

class CountChar{
	public static void main(String[] args)
	{
		String data;
		int cnt=0;
		char c;
		Scanner input = new Scanner(System.in);
		System.out.println("문자열을 입력하시오:");
		data = input.next();
		for(int i=0;i<data.length();i++){	//string 길이 출력 .length()
			c = data.charAt(i);		//문자 하나씩 읽어오기
			if( c =='a' || c=='A'||c =='e' || c=='E'||c =='i' || c=='I'||c =='o' || c=='O' 
			||c =='u' || c=='U'){
				cnt++;
			}//end if
		}//end for
		System.out.println("모음의 수는"+cnt+"개 입니다.");
		System.out.printf("모음의 수는 %d개입니다.",cnt);
	}
}
