//����) �̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40���̻����� �Ǻ��Ͽ�
// ����ϰ��� ��������� ����� ����ϵ��� ����

import java.util.Scanner;
import java.util.Date;
class CancerTest03{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();      
      String name;
      int age;
      int thisyear = today.getYear()+1900;
      int birthyear;
	
      System.out.println("�̸��� �Է��ϼ���");
      name=sc.next();
      System.out.println("��������� �Է��ϼ���");
      birthyear=sc.nextInt();

      age = thisyear - birthyear;

      System.out.println("���ش� " +thisyear +"�⵵�Դϴ�.");

      if(age>=40)
          System.out.println(name + "��, ���ؿ�" +age +"�� �Դϴ�. ����ϰ��� ����� �Դϴ�.");
      else
          System.out.println(name + "��, ���ؿ�" +age +"�� �Դϴ�. ����ϰ��� ����ڰ� �ƴմϴ�.");
      
   }
}