import java.util.Scanner;
class MyUtil
{
	boolean checkArray(int []a,int []b){
		if(a.length!=b.length){	//�迭�� ���� �� 
			return false;
		}
		for(int i=0;i<a.length;i++){	//�迭 ������ ��
			if(a[i]!=b[i]){
				return false;
			}
		}
		return true;
	}
}

class MethodTest04 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int []a = new int[5];
		int []b = new int[5];

		System.out.println("ù��° �迭 �Է�");

		for(int i=0;i<a.length;i++){
			System.out.print(i+1+"��° ���� �Է��ϼ���:");
			a[i]=input.nextInt();
		}

		System.out.println("�ι�° �迭 �Է�");

		for(int i=0;i<a.length;i++){
			System.out.print(i+1+"��° ���� �Է��ϼ���:");
			b[i]=input.nextInt();
		}
		
		MyUtil util = new MyUtil();
		boolean flag = util.checkArray(a,b);
		if(flag)
			System.out.println("�� �迭�� �����մϴ�.");
		else
			System.out.println("�� �迭�� �������� �ʽ��ϴ�.");
	}
}
