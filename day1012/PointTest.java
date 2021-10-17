class Point {
  int x;
  int y;
  public int getX(){	//속성(멤버변수) x의 값을 반환하는 기능
	  return x;
  }

  public void setX(int xCoord){	//매개변수로 전달받은 값을 속성(멤버변수)x 설정하는 기능
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
		Point p1 = new Point(); //객체 생성
		p1.setX(100);
		p1.setY(200);

		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);

		System.out.println("x좌표:"+p1.getX()+",y좌표:"+p1.getY());
		System.out.println("x좌표:"+p2.getX()+",y좌표:"+p2.getY());
	}
}
