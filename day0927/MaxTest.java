//��������� �ΰ��� ������ �Է¹޾� �� �߿� ū ���� ã�� ����ϴ� ���α׷��� �ۼ�
import java.util.Scanner;
class MaxTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a, b, max;
      System.out.println("ù ��° ���� �Է��Ͻÿ�==>");
      a = sc.nextInt();
      b = sc.nextInt();
      if(a>b) 
         max = a;
      else
         max = b;
      System.out.println("ū���� " + max + "�Դϴ�.");
   }
}