//자기 자신을 호출하는 메소드를 재귀 메소드(recursive method)라 한다.
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
