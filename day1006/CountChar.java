import java.util.Scanner;

class CountChar{
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
			if( c =='a' || c=='A'||c =='e' || c=='E'||c =='i' || c=='I'||c =='o' || c=='O' 
			||c =='u' || c=='U'){
				cnt++;
			}//end if
		}//end for
		System.out.println("������ ����"+cnt+"�� �Դϴ�.");
		System.out.printf("������ ���� %d���Դϴ�.",cnt);
	}
}
