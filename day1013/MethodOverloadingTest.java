class SistUtil{
	//�ΰ��� ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
	public void max(int a,int b){
		int max=a;
		if(max<b)
			max=b;
		System.out.println("ū����"+max+"�Դϴ�.");
	}

	//�ΰ��� �Ǽ��� �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
	public void max(double a,double b){
		double max=a;
		if(max<b)
			max=b;
		System.out.println("ū����"+max+"�Դϴ�.");
	}
}

class MethodOverloadingTest
{
	public static void main(String[] args) 
	{
		 SistUtil s1 = new SistUtil();
		 s1.max(8,4);
		 s1.max(5.5,10.2);
	}
}
/*
StaticTest02.java:34: error: non-static method toString() cannot be referenced from a static context
                Family.toString();
                      ^
1 error
*///static�޼ҵ尡 �ƴϸ� Ŭ�����̸����� ���� �Ұ�