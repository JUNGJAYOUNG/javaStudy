/*
배열중에서 가장 큰 수 찾기
1) 가장 큰 수를 찾아 저장하기 위한 max라는 변수를 선언한다.
2) 배열의 맨첫번째 요소를 일단은 max라고 본다.
3) 반복문을 이용하여 배열은 두번째 요소부터 max에 담긴 것을 비교하여
비교하는 배열의 값이 max보다 더 크다면 그 배열의 값을 max라고 본다.
*/
import java.util.Scanner;
class ScoreOfArray 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int []score = new int[10];
		for(int i=0;i<score.length;i++){
			System.out.print("점수를 입력하세요:");
			score[i]=input.nextInt();	
		}
		System.out.print("점수 전체 출력:");
		for(int i=0;i<score.length;i++){
			System.out.print(score[i]+" ");
		}
		System.out.println("");

		int max=score[0];
		int min=score[0];
		for(int i=1;i<score.length;i++){
			if(max<score[i]){	//큰값을 구하는 if와 작은값을 구하는 if는
								//별개다.(따로 if문 필요)
				max=score[i];
			}
			if(min>score[i]){
				min=score[i];
			}
		}
		System.out.println("배열의 최대값은"+max+"입니다.");
		System.out.println("배열의 최소값은"+min+"입니다.");

	}
}
