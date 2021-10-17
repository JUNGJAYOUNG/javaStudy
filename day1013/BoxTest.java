class Box {

  private int width;
  private int length;
  private int height;
  private boolean empty;
  private String things; //담을 물건

  public Box(){	//다른 생성자를 이미 생성해뒀으니 기본 생성자를 무조건 정의해놔야 하지만
	  
	  
	  empty=true;          //안에 초기화 내용을 적지 않아도 자동으로 초기화는 된다.
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
	if(!empty){	//empty == false
		r=",비어있지 않음";
	}
	return "가로:"+width+",세로:"+length+",높이:"+height+","+r+"담긴물건:"+things;
  }

  public void put(String things){
	this.things = things;
	empty = false;
	System.out.println("박스에" +things +"를 담았어요.");
  }

  public String take(){
	String r = things;
	things = "없음";
	empty = true;
	return r;
  }

}

class BoxTest
{
	public static void main(String[] args) 
	{
		Box box1 = new Box(10,20,30);
		Box box2 = new Box();

		System.out.println(box1);
		System.out.println(box2);

		box1.put("공");
		box2.put("책");

		System.out.println(box1);
		System.out.println(box2);
		
		String r = box2.take();
		System.out.println("박스2에 담긴물건:"+r);
		System.out.println("===============");
		System.out.println(box1);
		System.out.println(box2);
		
	}
}
