
import java.util.Scanner;
class AvgTest
{
	public static void main(String[] args) 
	{
		
		String name;
		int kor,eng,math;
		double avg;
		Scanner input = new Scanner(System.in);

		System.out.print("이름:");
		name=input.next();
		System.out.print("국어점수:");
		kor=input.nextInt();
		System.out.print("영어점수:");
		eng=input.nextInt();
		System.out.print("수학점수:");
		math=input.nextInt();
		
		avg = (double)(kor+eng+math)/3; //double로 type casting해도 되고, 
										//3.0으로 나눠도 실수로 계산 가능

		System.out.println("**평균점수:"+avg);
		if (avg>=60)
			System.out.print("합격");
		else
			System.out.print("불합격");

	}
}
