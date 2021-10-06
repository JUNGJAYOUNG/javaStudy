import java.io.IOException;

public class Test02{
	public static void main(String[] args) throws IOException
	{
		String s;

		System.out.printf("문자를 입력하시오:");
		char c = (char) System.in.read();
		
		switch(c){
			case 'a':case 'e':case 'i':case 'u':case 'o':
				System.out.printf("입력된 문자 %c은 모음입니다.",c);
				break;
			case 'A':case 'I':case 'U':case 'E':case 'O':
				System.out.printf("입력된 문자 %C은 모음입니다.",c);
				break;
			default:
				System.out.println("입력된 문자는 모음이 아닙니다.");
		}
	}
}
