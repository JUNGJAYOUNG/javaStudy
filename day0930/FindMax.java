import java.util.Scanner;
class FindMax 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a,b,c,max;
		System.out.print("ù��° ���� �Է��ϼ���:");
		a=input.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���:");
		b=input.nextInt();
		System.out.print("����° ���� �Է��ϼ���:");
		c=input.nextInt();

		if(a>b){
			if(a>c){		//��ø���ù�
		       max=a;
			}else{			//��ø���ù������� else�� ���� ����� if�� �����ȴ�.			            //if�� ������.
			   max=c;
			}
		}else{
			if(b>c){
			   max=b;
			}else{
               max=c;
			}
		}
		System.out.println("���� ū ����:"+max);
    }
}