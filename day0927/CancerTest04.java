//����) ���ο����� �ݳ����� 40���̻��� ����鿡�� ����ϰ����� �ǽ�
//�ϰ��� ����ڴ� 40�� �̻��̰�
//���ذ� ¦�������� ¦�������� �¾���
//���ذ� Ȧ�������� Ȧ�������� �¾���

import java.util.Scanner;
import java.util.Date;
class CancerTest04{

  public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     Date today = new Date();
     String name;
     int birthyear;
     int yearcheck, age, thisyear;     

     System.out.println("�̸��� �Է��ϼ���.");
     name = sc.next();
     System.out.println("����⵵�� �Է��ϼ���.");
     birthyear = sc.nextInt();
     thisyear = today.getYear() + 1900;     
     age = thisyear - birthyear;

     if ( age>=40 && ( birthyear%2 == thisyear%2 ) )
     System.out.println(name +"���尡��");
     else
     System.out.println(name +"����Ұ���");
}

}