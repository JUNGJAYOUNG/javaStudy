class Box {

  int width;
  int length;
  int height;

  public int getWidth(){
	  return width;
  }

  public void setWidth(int w){
	  width=w;	

  }
  public int getHeight(){
	  return height;
  }

  public void setHeight(int h){
	  height=h;	
  }

  public int getLength(){
	  return length;
  }

  public void setLength(int l){
	  length=l;	
  }

  public int getVolume(){
	return width*height*length;
  }
	//현재 상자의 속성값을 문자열로 만들어서 반환
  public String toString(){ 
	String result="가로:"+width+",세로:"+length+",높이:"+height;
	return result;
  }
 
}


class BoxTest 
{
	public static void main(String[] args) 
	{
		Box box1 = new Box();
		box1.setWidth(100);
		box1.setHeight(100);
		box1.setLength(100);

		Box box2 = new Box();
		box2.setWidth(200);
		box2.setHeight(200);
		box2.setLength(200);

		box1=box2; //대입
		System.out.println(box1.getWidth());//200
		System.out.println(box2.getWidth());//200

		/*
		원래 box1이 참조하고 있던 가로,세로,높이가 100인 개체는
		이제 더이상 아무도 참조하고 있지 않아서, 그 객체를 사용할 수 없다.
		더이상 사용할 수 없는 객체(메모리)를 garbage라고 한다.
		*/

		System.out.println(box1.getHeight());
		System.out.println(box1.getLength());

		System.out.println("상자의 부피:"+box1.getVolume());
		System.out.println(box1);
	}
}
