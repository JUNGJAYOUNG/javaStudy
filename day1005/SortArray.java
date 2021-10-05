/*
	정렬 : 값을 순서대로 표현하는 것을 말합니다.
	- 오름차순 정렬 : 값이 작은것부터 먼저 오게
	- 내림차순 정렬 : 값이 큰것부터 먼저 오게

	정렬하기 위해서는
	배열의 각 자리에 와야할 값을 차례로 찾아야 함.
*/
class SortArray 
{
	public static void main(String[] args) 
	{
		int []data = {5,2,3,9,1};
		for(int i=0;i<data.length;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]>data[j]){
					int temp;
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}

		System.out.println("오름차순 정렬 결과");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}	
}
