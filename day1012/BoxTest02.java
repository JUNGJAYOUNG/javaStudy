class Box {

  private int width;
  private int length;
  private int hei ght;
  private boolean empty;

  public Box(){	//�ٸ� �����ڸ� �̹� �����ص����� �⺻ �����ڸ� ������ �����س��� ������
	            //�ȿ� �ʱ�ȭ ������ ���� �ʾƵ� �ڵ����� �ʱ�ȭ�� �ȴ�.
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
	if(!empty){{	//empty == false
		result+=",������� ����";
	}

	return result="����:"+width+",����:"+length+",����:"+height+","+r;
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
