import java.util.Scanner;
class StudentTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String []name= new String[5];
		int []kor,[]eng,[]math,[]tot;
		double []avg=new double[5];
		
		for(int i=0;i<name.length;i++){
			System.out.printf("%d��° �л��� �̸� ==>");
		    name[i]=input.next();
			System.out.printf(("%d��° �л��� �������� ==>");
		    kor=input.nextInt();
			System.out.printf(("%d��° �л��� �������� ==>");
		    eng=input.nextInt();
			System.out.printf("%d��° �л��� �������� ==>");
		    math=input.nextInt();

			tot[i]=kor[i]+eng[i]+math[i];
			avg[i]=tot[i]/3.0;
		}

		for(int i=0;i<name.length;i++){
			for(int j=i+1;j<name.length;j++){
				if(avg[i]<avg[j]){
					String temp1;
					temp1=name[i];
					name[i]=name[j];
					name[j]=temp1;

					int temp2;
					temp2=kor[i];
					kor[i]=kor[j];
					kor[j]=temp2;

					temp2=eng[i];
					eng[i]=eng[j];
					eng[j]=temp2;

					temp2=math[i];
					math[i]=math[j];
					math[j]=temp2;

					temp2=tot[i];
					tot[i]=tot[j];
					tot[j]=temp2;
					
					double temp3=avg[i];
					avg[i]=avg[j];
					avg[j]=temp3;
				}
			}
		}

		System.out.println("** ���� ó�� ��� **");
		System.out.print("�̸�\t����\t����\t����\t����\t���");
		for(int i=0;i<name.length;i++){
			//System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avg[i]);
			System.out.prinf("%s\t%d\t%d\t%d\t%d\t.1f\n",name[i],kor[i],eng[i],math[i],tot[i],avg[i]);
		}	
	}	
}
