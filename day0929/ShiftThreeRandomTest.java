import java.util.Random;
class ShiftThreeRandomTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();//클래스를 사용하려면 객체부터 생성해줘야함
		
		int n = rand.nextInt();
		//System.out.println(n);
		
		//0에서 9사이의 난수가 발생하도록 프로그램을 수정하세요.

		n = n >>> 1; //오른쪽으로 한비트 이동시키면 무조건 양수가 만들어 짐.
		n = n % 10; //10으로 나눈 수는 어떤 수든 0~9사이임
		System.out.println(n);

	}
}
