//�ڱ� �ڽ��� ȣ���ϴ� �޼ҵ带 ��� �޼ҵ�(recursive method)�� �Ѵ�.
class RecursionTest 
{
	static int factorial(int n) {
		if (n == 1){
			return 1;
		}return i*factorial(i - 1);
	}

	public static void main(String[] args) {
		System.out.println("5!=" + factorial(5));
	}

}
