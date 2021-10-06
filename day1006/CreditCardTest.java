import java.util.Scanner;
class CreditCardTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double []arr = new double[12]; //월별 사용 금액
		double amount=0,avg=0; //1년 전체 사용 금액
		double max=0,min=0;	//지출 가장 많았던, 적었던 월
		int maxMon=0,minMon=0;
		for(int i=0;i<arr.length;i++){	//while로 반복되게 하고 싶은데.... 모르겠다..
			System.out.print(i+1+"월 사용금액을 입력하세요:");
			arr[i]=input.nextDouble();
			if(arr[i]<0)
				break;
			amount+=arr[i];	//1년 전체 사용 금액 계산
		}

		for(int i=1;i<arr.length;i++){	//최대 월, 최소 월 구하기
				max=arr[0];
				if(max<arr[i])
					max=arr[i];

				min=arr[0];
				if(min>arr[i])
					min=arr[i];
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==max){
				maxMon=i+1;
			}
			if(arr[i]==min){
				minMon=i+1;
			}
		}

		avg=amount/12;	//월별 평균 사용 금액
		
		System.out.println("1년 동안의 전체 사용 금액:"+amount);
		System.out.println("월별 평균 사용 금액:"+avg);
		System.out.println("가장 지출이 많았던 월:"+maxMon);
		System.out.println("가장 지출이 적었던 월:"+minMon);

	}
}
