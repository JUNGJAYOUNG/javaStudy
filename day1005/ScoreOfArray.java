/*
�迭�߿��� ���� ū �� ã��
1) ���� ū ���� ã�� �����ϱ� ���� max��� ������ �����Ѵ�.
2) �迭�� ��ù��° ��Ҹ� �ϴ��� max��� ����.
3) �ݺ����� �̿��Ͽ� �迭�� �ι�° ��Һ��� max�� ��� ���� ���Ͽ�
���ϴ� �迭�� ���� max���� �� ũ�ٸ� �� �迭�� ���� max��� ����.
*/
import java.util.Scanner;
class ScoreOfArray 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int []score = new int[10];
		for(int i=0;i<score.length;i++){
			System.out.print("������ �Է��ϼ���:");
			score[i]=input.nextInt();	
		}
		System.out.print("���� ��ü ���:");
		for(int i=0;i<score.length;i++){
			System.out.print(score[i]+" ");
		}
		System.out.println("");

		int max=score[0];
		int min=score[0];
		for(int i=1;i<score.length;i++){
			if(max<score[i]){	//ū���� ���ϴ� if�� �������� ���ϴ� if��
								//������.(���� if�� �ʿ�)
				max=score[i];
			}
			if(min>score[i]){
				min=score[i];
			}
		}
		System.out.println("�迭�� �ִ밪��"+max+"�Դϴ�.");
		System.out.println("�迭�� �ּҰ���"+min+"�Դϴ�.");

	}
}
