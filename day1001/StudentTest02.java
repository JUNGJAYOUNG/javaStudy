import java.util.Scanner;
class StudentTest02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int []age = new int[5];
		for(int i=0;i<age.length;i++){
			System.out.print((i+1)+"번째 학생의 나이를 입력하시오.");
			age[i]=input.nextInt();
		}
		int tot = 0;
		for(int i=0;i<age.length;i++){
			tot += age[i];
		}
		double avg =(double)tot/age.length;
		System.out.println("평균나이:"+avg);
	}
}