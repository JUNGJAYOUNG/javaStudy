//����11��
class PrimeTest 
{
	public static void main(String[] args) 
	{
		
		for(int k=2;k<100;k++){
			int cnt=0;
			for(int i=2;i<k;i++){
				if(k%i==0)
					cnt++;
			}
			if(cnt==0)
				System.out.println(k);
		}
	}
}
