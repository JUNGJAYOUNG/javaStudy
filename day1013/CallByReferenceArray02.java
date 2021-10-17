class CallByReferenceArray02
{
	public static int[] oneArray(int []arr1,int []arr2){
		int length=arr1.length+arr2.length;
		int []result= new int[length];

		for(int j=0;j<arr1.length;j++){
			result[j]=arr1[j];	
		}
		for(int k=0;k<arr2.length;k++){
			result[arr1.length+k]=arr2[k];
		}
		return result;
	}
	



	public static void main(String[] args) 
	{
		int []arr1 = {10,20,30};
		int []arr2 = {40,50,60};
		int []result=oneArray(arr1,arr2);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}
