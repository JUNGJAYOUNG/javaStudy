class SistUtil{

	//�ΰ��� �Ǽ��� �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
	public static void max(double a,double b){
		double max=a;
		if(max<b)
			max=b;
		System.out.println("ū����"+max+"�Դϴ�.");
	}
}

class MethodOverloadingTest03
{
	public static void main(String[] args) 
	{	
		 SistUtil.max(8,4);
		 //�� �´� int�� ���� �޼ҵ尡 ������ �ű�� ������
		 //���ٸ� double�� int�� �����ϴϱ� double�� ���� �޼ҵ尡 �����մϴ�.
		 SistUtil.max(5.5,10.2);
	}
}
