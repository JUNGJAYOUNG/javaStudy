import java.util.Scanner;
class CorrectTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int []answer = {1,3,2,4,2,3,1,2,3,1};	//정답 초기화
		int []user = new int[10];				//사용자 정답 저장할 배열 선언
		for(int i=0;i<user.length;i++){			//정답 입력 for문
			System.out.print((i+1)+"번 답을 입력하세요==>");
			user[i]=input.nextInt();
		}
		int cntO=0;	//맞은 문제 개수 저장 변수
		int cntX=0; //틀린 문제 개수 저장 변수
		for(int i=0;i<answer.length;i++){	//맞았는지 틀렸는지 여부 계산 for문
			if(user[i]==answer[i]){
				System.out.println((i+1)+"   O");
				cntO++;	//맞은 문제 개수 증가
			}else{
				System.out.println((i+1)+"   x");
				cntX++;	//틀린 문제 개수 증가
			}
		}
		System.out.println("정답수:" +cntO+"개");	//결과 출력
		System.out.println("틀린답수:" +cntX+"개");

	}
}