import java.util.Random;
class ShiftThreeRandomTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();//Ŭ������ ����Ϸ��� ��ü���� �����������
		
		int n = rand.nextInt();
		//System.out.println(n);
		
		//0���� 9������ ������ �߻��ϵ��� ���α׷��� �����ϼ���.

		n = n >>> 1; //���������� �Ѻ�Ʈ �̵���Ű�� ������ ����� ����� ��.
		n = n % 10; //10���� ���� ���� � ���� 0~9������
		System.out.println(n);

	}
}