//연습: 사용자한테 문자열을 입력받아 입력한 문자열에 소문자 'o'의 수를 파악하여 출력하는 프로그램 작성

import java.util.Scanner;
class FindO
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String data;
		System.out.println("문자열을 입력하세요.");
		data = input.next();
		
		int count=0;
		for (int i=0; i<data.length(); i++)
		{
			if(data.charAt(i)=='o')
				count = count+1;
		}
		System.out.println("소문자 o의 개수는"+ count +"개입니다");		
	}
}
