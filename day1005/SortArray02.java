import java.util.Scanner;
class SortArray02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String []name= new String[5];
		int []score=new int[5];
		
		for(int i=0;i<name.length;i++){
			System.out.print((i+1)+"번째 학생의 이름 ==>");
		    name[i]=input.next();
			System.out.print((i+1)+"번째 학생의 점수 ==>");
		    score[i]=input.nextInt();
		}

		for(int i=0;i<score.length;i++){
			for(int j=i+1;j<score.length;j++){
				if(score[i]<score[j]){
					int temp;
					temp=score[i];
					score[i]=score[j];
					score[j]=temp;

					String temp2;
					temp2=name[i];
					name[i]=name[j];
					name[j]=temp2;
				}
			}
		}

		System.out.println("** 성적순 정렬 **");
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]+" ");
			System.out.println(score[i]);
		}	
	}	
}
