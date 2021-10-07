class CopyArray03
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5,6,7,8,9,10};
		int []b = {1,2,3,4,5};
		
		if(a.length!=b.length){
			System.out.println("배열의 내용이 일치하지 않습니다.");
			return;	//메인 메소드를 아예 멈춤
		}

		boolean flag=true;
		for(int i=0;i<a.length;i++){	
			if(a[i]!=b[i]){	//다른 배열 요소가 있으면
				flag=false;	//false 대입
				break;		//더이상 검사할 필요 없으니 for문 탈출
			}
		}

		if(flag){
			System.out.println("배열의 내용이 일치합니다.");
		}else{
			System.out.println("배열의 내용이 일치하지 않습니다.");
		}
	
	}
}
