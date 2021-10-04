class LoopArray 
{
	public static void main(String[] args) 
	{
		//1부터 45까지의 숫자 6개를 말해봅니다.
		int []lotto = {4,11,19,26,27,43}; //21
		
		System.out.println("건우가 추천하는 이번주 로또 번호");

		for(int i=0;i<lotto.length;i++){ //.length는 속성이므로 ()필요없다.
			System.out.print(lotto[i]+" ");
		}

		/*	
		System.out.print(lotto[0]);
		System.out.print(lotto[1]);
		System.out.print(lotto[2]);
		System.out.print(lotto[3]);
		System.out.print(lotto[4]);
		System.out.print(lotto[5]);
		*/
	}
}
