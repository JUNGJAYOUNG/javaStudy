class Box {

  private int width;
  private int length;
  private int hei ght;
  private boolean empty;

  public Box(){	//다른 생성자를 이미 생성해뒀으니 기본 생성자를 무조건 정의해놔야 하지만
	            //안에 초기화 내용을 적지 않아도 자동으로 초기화는 된다.
  }

  public Box(int width,int length,int height){
    this.width=width;
	this.length=length;
	this.height=height;
	this.empty=true;
  }

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
	String r="비어있음";
	if(!empty){{	//empty == false
		result+=",비어있지 않음";
	}

	return result="가로:"+width+",세로:"+length+",높이:"+height+","+r;
  }
}

class BoxTest02 
{
	public static void main(String[] args) 
	{
		Box box1 = new Box(10,20,30);
		Box box2 = new Box(200,200,200,false);

		System.out.println(box1);
		System.out.println(box2);
	}
}
