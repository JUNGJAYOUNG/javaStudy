//����) ��������� �ΰ��� ������ �Է¹޾� ���ϱ�, ����, ���ϱ�, ������
//�� ����� ����ϴ� ���α׷��� �ۼ��ϰ�, �����ϰ�, ������, �����غ��ϴ�.

import java.util.Scanner;
class Calculate{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int num1;
      int num2;
      int plus,sub,mul,div;

      System.out.println("ù��° ���� �Է��ϼ���");
      num1 = sc.nextInt();
      System.out.println("�ι�° ���� �Է��ϼ���");
      num2 = sc.nextInt();
      plus=num1+num2;
      sub=num1-num2;
      mul=num1*num2;
      div=num1/num2;
      System.out.println("** ��� ��� **");
      System.out.println("���ϱ� :"+plus);
      System.out.println("���� :"+sub); 
      System.out.println("���ϱ� :"+mul);
      System.out.println("������ :"+div);     
      }
}