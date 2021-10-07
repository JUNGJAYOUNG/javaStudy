import java.util.Scanner;
class Programming01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double []pay = new double[12]; //월별 사용 금액
		double total = 0;
		double avg;

		for(int i=0;i<pay.length;i++){
			do{
				System.out.printf("%d월의 카드 사용금액을 입력하세요:",i+1);
				pay[i]=input.nextDouble();
			}while(pay[i]<0);	//음수라면 계속 되물어보기
			total+=pay[i];
		}
		avg = total/pay.length;
		
		double max = pay[0];
		double min = pay[0];
		int max_month=0;
		int min_month=0;

		for(int i=1;i<pay.length;i++){	//최대 월, 최소 월 구하기
			if(max<pay[i]){
				max=pay[i];
				max_month=i;
			}
			if(min>pay[i]){
				min=pay[i];
				min_month=i;
			}
		}

		System.out.printf("1년 동안의 전체 사용 금액:%.1f\n",total);
		System.out.printf("월별 평균 사용 금액:%.1f\n",avg);
		System.out.printf("가장 지출이 많았던 월:%d\n",max_month+1);
		System.out.printf("가장 지출이 적었던 월:%d\n",min_month+1);
	}
}
