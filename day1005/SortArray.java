/*
	���� : ���� ������� ǥ���ϴ� ���� ���մϴ�.
	- �������� ���� : ���� �����ͺ��� ���� ����
	- �������� ���� : ���� ū�ͺ��� ���� ����

	�����ϱ� ���ؼ���
	�迭�� �� �ڸ��� �;��� ���� ���ʷ� ã�ƾ� ��.
*/
class SortArray 
{
	public static void main(String[] args) 
	{
		int []data = {5,2,3,9,1};
		for(int i=0;i<data.length;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]>data[j]){
					int temp;
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}

		System.out.println("�������� ���� ���");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}	
}