//�ڱ� �ڽ��� ȣ���ϴ� �޼ҵ带 ��� �޼ҵ�(recursive method)�� �Ѵ�.
class RecursiveSum
{
	static int getSum(int n) {
		if (n == 1){
			return 1;
		}
		return n+getSum(n-1);
	}

	public static void main(String[] args) {
		System.out.println("5������=" +getSum(5));
		System.out.println("7������=" +getSum(7));
	}

}
