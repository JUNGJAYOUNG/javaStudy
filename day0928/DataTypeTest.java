class DataTypeTest 
{
	public static void main(String[] args) 
	{
		int age;
		age = 27;
		System.out.println("�ӻ����� ����:" + age + "���Դϴ�.");
		
		//double height;
		float height;
		//height = 173.8;
		//height = 173.8.f; //�Ǽ����� float������ �����ϱ� ���ؼ��� ���̻� f
		height = (float)173.8; //�ڷ�����ȯ�� �Ͽ� ������ �� �ִ�
		System.out.println("�ӻ����� Ű:" + height);
		
		char gender;
		gender = 'm';
		//gender = "m"; //�ֵ���ǥ�� ������ ���ڿ�(String)���� ����ϱ� ������ char�� ������ �� x
		System.out.println("�ӻ����� ������:" + gender);

        boolean isVaccine;
		isVaccine = true;
		System.out.println("�ӻ����� 1�������������:" + isVaccine);



	}
}
/*

DataTypeTest.java:11: error: incompatible types: 
possible lossy conversion from double to float
height = 173.8;

DataTypeTest.java:18: error: incompatible types: String cannot be converted to char
                gender = "m";
                         ^
1 error
*/