//사용자한테 문자열을 입력받아 맨 첫번쨰 문자 출력

import java.util.Scanner;
class PrintFirst
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("문자열을 입력하세요");
		str = input.next();
		char first;
		first = str.charAt(0);
		System.out.println(first);
		
		//str = data.charAt(0)+""; //String으로 만드는 가장 쉬운 방법 + ""
		//String first = str.substring(0,1); //문자열 추출(한문자열도가능)
		//System.out.println("첫번째 문자는" + first);
	}
}
