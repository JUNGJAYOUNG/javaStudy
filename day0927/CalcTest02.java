//����) ��������� �ΰ��� ������ �Է¹޾� ���ϱ�, ����, ���ϱ�, ������
//�� ����� ����ϴ� ���α׷��� �ۼ��ϰ�, �����ϰ�, ������, �����غ��ϴ�.

import java.util.Scanner;
class CalcTest02{
   public static void main(String []args){
      int num1;
      int num2;
      int plus,sub,mul,div;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("ù��° ���� �Է��ϼ���");
      num1 = sc.nextInt();
      System.out.println("�ι�° ���� �Է��ϼ���");
      num2 = sc.nextInt();
      plus=num1+num2;
      sub=num1-num2;
      mul=num1*num2;
      div=num1/num2;

      System.out.println("** ��� ��� **");
      System.out.println("���ϱ� :"+(num1+num2));
      System.out.println("���� :"+(num1-num2)); 
      System.out.println("���ϱ� :"+(num1*num2));
      System.out.println("������ :"+(num1/num2));     
      }
}