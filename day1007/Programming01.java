import java.util.Scanner;
class Programming01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double []pay = new double[12]; //���� ��� �ݾ�
		double total = 0;
		double avg;

		for(int i=0;i<pay.length;i++){
			do{
				System.out.printf("%d���� ī�� ���ݾ��� �Է��ϼ���:",i+1);
				pay[i]=input.nextDouble();
			}while(pay[i]<0);	//������� ��� �ǹ����
			total+=pay[i];
		}
		avg = total/pay.length;
		
		double max = pay[0];
		double min = pay[0];
		int max_month=0;
		int min_month=0;

		for(int i=1;i<pay.length;i++){	//�ִ� ��, �ּ� �� ���ϱ�
			if(max<pay[i]){
				max=pay[i];
				max_month=i;
			}
			if(min>pay[i]){
				min=pay[i];
				min_month=i;
			}
		}

		System.out.printf("1�� ������ ��ü ��� �ݾ�:%.1f\n",total);
		System.out.printf("���� ��� ��� �ݾ�:%.1f\n",avg);
		System.out.printf("���� ������ ���Ҵ� ��:%d\n",max_month+1);
		System.out.printf("���� ������ ������ ��:%d\n",min_month+1);
	}
}
