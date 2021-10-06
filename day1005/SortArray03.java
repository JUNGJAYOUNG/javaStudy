import java.util.Scanner;
class SortArray03 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String []name= new String[5];
		int kor,eng,math,tot;
		int []avg=new int[5];
		
		for(int i=0;i<name.length;i++){
			System.out.print((i+1)+"번째 학생의 이름 ==>");
		    name[i]=input.next();
			System.out.print((i+1)+"번째 학생의 국어점수 ==>");
		    kor=input.nextInt();
			System.out.print((i+1)+"번째 학생의 영어점수 ==>");
		    eng=input.nextInt();
			System.out.print((i+1)+"번째 학생의 수학점수 ==>");
		    math=input.nextInt();

			tot=kor+eng+math;
			avg[i]=tot/3;
		}

		for(int i=0;i<avg.length;i++){
			for(int j=i+1;j<avg.length;j++){
				if(avg[i]<avg[j]){
					int temp;
					temp=avg[i];
					avg[i]=avg[j];
					avg[j]=temp;

					String temp2;
					temp2=name[i];
					name[i]=name[j];
					name[j]=temp2;
				}
			}
		}

		System.out.println("** 총점 평균순 정렬 **");
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]+" ");
			System.out.println(avg[i]);
		}	
	}	
}
