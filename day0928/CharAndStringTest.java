class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		//�ڹٿ����� ���Ϲ����� ó���� ���ڿ��� ó���� �ٸ�
	    //�ϳ��� ���ڸ� ǥ�� ''(Ȭ����ǥ)
		//���ڿ� ó�� ""(�ֵ���ǥ)
		//���� �ϳ��� ���������� �ֵ���ǥ�� �����ٸ� char�� ������ �� ����
		//String���� �����ؾ� ��.

		char firstName;
		firstName = '��'; 		
		System.out.println(firstName);

		String name;
		name = "�ڼ���";
		System.out.println(name);
		
			
		//char lastName;
		String lastName;
		lastName = "��";
		System.out.println(lastName);
	
		String data;
		data = "hello";
		char last = data.charAt(4);
		//charAt�� String�� ��ġ(index)�� �ִ� ���� �ϳ��� �˷��ִ� ����Դϴ�.
		//��ġ(index)�� 0���� ����մϴ�.

		System.out.println("�Ǹ������� �ִ� ���ڴ�" + last + "�Դϴ�.");
		
	
	}
}

/*
CharAndStringTest.java:21: error: incompatible types: String cannot be converted to char
                lastName = "��";
                           ^
1 error

*/

