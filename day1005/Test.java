import java.util.Scanner;

public class Test{
	public static void main(String[] args) 
	{
		int score;
		Scanner input = new Scanner(System.in);
		System.out.printf("������ �Է��Ͻÿ�:");
		score=input.nextInt();
		
		//System.out.println((score>=60)?"�հ�!":"���հ�!");
		
		if(score>=80){
			System.out.println("���� ����ϰ� �հ��Ͽ����ϴ�.");
		}else if(score>=70){
			System.out.println("����ϰ� �հ��Ͽ����ϴ�.");
		}else if(score>=60){
			System.out.println("�հ��Դϴ�.");
		}else if(score>=50){
			System.out.println("��Ÿ���� ���հ��Դϴ�.");
		}else{
			System.out.println("���հ��Դϴ�.");
		}
	}
}
