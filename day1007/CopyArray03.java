class CopyArray03
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5,6,7,8,9,10};
		int []b = {1,2,3,4,5};
		
		if(a.length!=b.length){
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
			return;	//���� �޼ҵ带 �ƿ� ����
		}

		boolean flag=true;
		for(int i=0;i<a.length;i++){	
			if(a[i]!=b[i]){	//�ٸ� �迭 ��Ұ� ������
				flag=false;	//false ����
				break;		//���̻� �˻��� �ʿ� ������ for�� Ż��
			}
		}

		if(flag){
			System.out.println("�迭�� ������ ��ġ�մϴ�.");
		}else{
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
		}
	
	}
}
