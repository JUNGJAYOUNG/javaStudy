//연습) 문자열을 입력받아 문자열의 길이가 4글자 이상인지 true, false 출력

import java.util.Scanner;
class CheckLen 
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		String str;
		boolean check;

		System.out.println("문자열을 입력하세요!");
		str = input.next();
		check = str.length() >= 4;
		System.out.println(check);
		
	}
}
