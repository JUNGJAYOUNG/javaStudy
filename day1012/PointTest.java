class Point {
  int x;
  int y;
  public int getX(){	//�Ӽ�(�������) x�� ���� ��ȯ�ϴ� ���
	  return x;
  }

  public void setX(int xCoord){	//�Ű������� ���޹��� ���� �Ӽ�(�������)x �����ϴ� ���
	  x=xCoord;	
  }

  public void setY(int yCoord){
	  y=yCoord;	
  }

  public int getY(){
	  return y;
  }

}


class PointTest 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point(); //��ü ����
		p1.setX(100);
		p1.setY(200);

		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);

		System.out.println("x��ǥ:"+p1.getX()+",y��ǥ:"+p1.getY());
		System.out.println("x��ǥ:"+p2.getX()+",y��ǥ:"+p2.getY());
	}
}
