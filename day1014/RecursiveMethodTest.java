//�ڱ� �ڽ��� ȣ���ϴ� �޼ҵ带 ��� �޼ҵ�(recursive method)�� �Ѵ�.
class RecursiveMethodTest 
{
	static int getFactorial(int n) {
		if (n == 1){
			return 1;
		}return n*getFactorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("5!=" +getFactorial(5));
		System.out.println("7!=" +getFactorial(7));
	}

}
