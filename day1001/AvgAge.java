class AvgAge 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int []age={27,28,26,29,28};
		//5명의 평균을 나이를 계산하여 출력 해 봅니다.
		for(int i=0;i<age.length;i++){
			sum+=age[i];
		}	
		double avg=(double)sum/age.length;
		System.out.println("평균 나이는:"+avg);
	}
}
