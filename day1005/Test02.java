import java.io.IOException;

public class Test02{
	public static void main(String[] args) throws IOException
	{
		String s;

		System.out.printf("���ڸ� �Է��Ͻÿ�:");
		char c = (char) System.in.read();
		
		switch(c){
			case 'a':case 'e':case 'i':case 'u':case 'o':
				System.out.printf("�Էµ� ���� %c�� �����Դϴ�.",c);
				break;
			case 'A':case 'I':case 'U':case 'E':case 'O':
				System.out.printf("�Էµ� ���� %C�� �����Դϴ�.",c);
				break;
			default:
				System.out.println("�Էµ� ���ڴ� ������ �ƴմϴ�.");
		}
	}
}
