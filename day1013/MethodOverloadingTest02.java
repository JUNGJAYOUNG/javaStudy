class SistUtil{
	//�ΰ��� ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
	public static void max(int a,int b){
		max((double)a,(double)b);
	}

	//�ΰ��� �Ǽ��� �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
	public static void max(double a,double b){
		double max=a;
		if(max<b)
			max=b;
		System.out.println("ū����"+max+"�Դϴ�.");
	}
}

class MethodOverloadingTest02
{
	public static void main(String[] args) 
	{
		 SistUtil.max(8,4);
		 SistUtil.max(5.5,10.2);
	}
}
