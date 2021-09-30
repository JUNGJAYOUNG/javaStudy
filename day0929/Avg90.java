import java.util.Scanner;
class Avg90 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		int kor,eng,math;
		double avg;

		System.out.print("이름:");
		name = input.next();
		System.out.print("국어점수를 입력하세요:");
		kor = input.nextInt();
		System.out.print("영어점수를 입력하세요:");
		eng = input.nextInt();
		System.out.print("수학점수를 입력하세요:");
		math = input.nextInt();
		
		avg = (kor+eng+math)/3.0;

		if(kor>=90 && avg>=90)
			System.out.print(name +"님은 장학금 지급대상자입니다.");
		else
			System.out.print(name +"님은 장학금 지급대상자가 아닙니다.");
		
	}
}
