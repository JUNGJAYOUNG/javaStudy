import java.util.Scanner;
class CorrectTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int []answer = {1,3,2,4,2,3,1,2,3,1};	//���� �ʱ�ȭ
		int []user = new int[10];				//����� ���� ������ �迭 ����
		for(int i=0;i<user.length;i++){			//���� �Է� for��
			System.out.print((i+1)+"�� ���� �Է��ϼ���==>");
			user[i]=input.nextInt();
		}
		int cntO=0;	//���� ���� ���� ���� ����
		int cntX=0; //Ʋ�� ���� ���� ���� ����
		for(int i=0;i<answer.length;i++){	//�¾Ҵ��� Ʋ�ȴ��� ���� ��� for��
			if(user[i]==answer[i]){
				System.out.println((i+1)+"   O");
				cntO++;	//���� ���� ���� ����
			}else{
				System.out.println((i+1)+"   x");
				cntX++;	//Ʋ�� ���� ���� ����
			}
		}
		System.out.println("�����:" +cntO+"��");	//��� ���
		System.out.println("Ʋ�����:" +cntX+"��");

	}
}