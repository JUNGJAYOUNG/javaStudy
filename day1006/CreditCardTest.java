import java.util.Scanner;
class CreditCardTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double []arr = new double[12]; //���� ��� �ݾ�
		double amount=0,avg=0; //1�� ��ü ��� �ݾ�
		double max=0,min=0;	//���� ���� ���Ҵ�, ������ ��
		int maxMon=0,minMon=0;
		for(int i=0;i<arr.length;i++){	//while�� �ݺ��ǰ� �ϰ� ������.... �𸣰ڴ�..
			System.out.print(i+1+"�� ���ݾ��� �Է��ϼ���:");
			arr[i]=input.nextDouble();
			if(arr[i]<0)
				break;
			amount+=arr[i];	//1�� ��ü ��� �ݾ� ���
		}

		for(int i=1;i<arr.length;i++){	//�ִ� ��, �ּ� �� ���ϱ�
				max=arr[0];
				if(max<arr[i])
					max=arr[i];

				min=arr[0];
				if(min>arr[i])
					min=arr[i];
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==max){
				maxMon=i+1;
			}
			if(arr[i]==min){
				minMon=i+1;
			}
		}

		avg=amount/12;	//���� ��� ��� �ݾ�
		
		System.out.println("1�� ������ ��ü ��� �ݾ�:"+amount);
		System.out.println("���� ��� ��� �ݾ�:"+avg);
		System.out.println("���� ������ ���Ҵ� ��:"+maxMon);
		System.out.println("���� ������ ������ ��:"+minMon);

	}
}
