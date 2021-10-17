//자기 자신을 호출하는 메소드를 재귀 메소드(recursive method)라 한다.
class RecursiveSum
{
	static int getSum(int n) {
		if (n == 1){
			return 1;
		}
		return n+getSum(n-1);
	}

	public static void main(String[] args) {
		System.out.println("5누적합=" +getSum(5));
		System.out.println("7누적합=" +getSum(7));
	}

}
