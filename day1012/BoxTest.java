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
	//���� ������ �Ӽ����� ���ڿ��� ���� ��ȯ
  public String toString(){ 
	String result="����:"+width+",����:"+length+",����:"+height;
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

		box1=box2; //����
		System.out.println(box1.getWidth());//200
		System.out.println(box2.getWidth());//200

		/*
		���� box1�� �����ϰ� �ִ� ����,����,���̰� 100�� ��ü��
		���� ���̻� �ƹ��� �����ϰ� ���� �ʾƼ�, �� ��ü�� ����� �� ����.
		���̻� ����� �� ���� ��ü(�޸�)�� garbage��� �Ѵ�.
		*/

		System.out.println(box1.getHeight());
		System.out.println(box1.getLength());

		System.out.println("������ ����:"+box1.getVolume());
		System.out.println(box1);
	}
}
