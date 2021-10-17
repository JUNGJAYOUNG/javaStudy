class Box {

  private int width;
  private int length;
  private int height;
  private boolean empty;
  private String things; //���� ����

  public Box(){	//�ٸ� �����ڸ� �̹� �����ص����� �⺻ �����ڸ� ������ �����س��� ������
	  
	  
	  empty=true;          //�ȿ� �ʱ�ȭ ������ ���� �ʾƵ� �ڵ����� �ʱ�ȭ�� �ȴ�.
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
	//���� ������ �Ӽ����� ���ڿ��� ���� ��ȯ
  public String toString(){ 
	String r="�������";
	if(!empty){	//empty == false
		r=",������� ����";
	}
	return "����:"+width+",����:"+length+",����:"+height+","+r+"��买��:"+things;
  }

  public void put(String things){
	this.things = things;
	empty = false;
	System.out.println("�ڽ���" +things +"�� ��Ҿ��.");
  }

  public String take(){
	String r = things;
	things = "����";
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

		box1.put("��");
		box2.put("å");

		System.out.println(box1);
		System.out.println(box2);
		
		String r = box2.take();
		System.out.println("�ڽ�2�� ��买��:"+r);
		System.out.println("===============");
		System.out.println(box1);
		System.out.println(box2);
		
	}
}
