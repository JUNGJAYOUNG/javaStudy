import java.util.Scanner;

class LengthOfVowels_Switch{
	public static void main(String[] args)
	{
		String data;
		int cnt=0;
		char c;
		Scanner input = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��Ͻÿ�:");
		data = input.next();
		for(int i=0;i<data.length();i++){	//string ���� ��� .length()
			c = data.charAt(i);		//���� �ϳ��� �о����
			switch(c){
				case 'a':case 'A':case 'i':case 'I':case 'u':case 'U':case 'e':case 'E':
				case 'o':case 'O':
					cnt++;
			}
		}//end for
		System.out.println("������ ����"+cnt+"�� �Դϴ�.");
		System.out.printf("������ ���� %d���Դϴ�.",cnt);
	}
}
