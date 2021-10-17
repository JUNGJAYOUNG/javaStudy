class Product{

	private String name;
	private int count;
	private int price;

	//��� ���� name�� ���� ����(����)�ϴ� �޼ҵ带 ����
	public void setName(String n){
		//������� name�� �Ű������� ���޹��� n���� ����
		name = n;
		return;//(�����Ǿ�����, ���ϰ��� ����)
	}

	public String getName(){
		return name; //���ϰ��� �ִ�
	}
	
	public void setCount(int n){
		count = n;
		return;//�����Ǿ��ִ�.
	}
	public int getCount(){
		return count;
	}

	public void setPrice(int n){
		price = n;
		return;//�����Ǿ��ִ�.
	}
	public int getPrice(){
		return price;
	}

	public String toString(){
		String result="";
		result+="��ǰ��"+name+"\n";
		result+="����"+count+"\n";
		result+="����"+price+"\n";
		return result;
	}

}

class ProductTest{

	public static void main(String[] args){

		Product p1;

		p1=new Product(); //PersonŬ������ ��ü�� �����Ͽ� p1�� ����
		
		//p1.name = "ȫ�浿";
		//p1.age =20;
		
		p1.setName("������13");
		p1.setCount(5);
		p1.setPrice(1500000);

		System.out.println(p1.getName());
		System.out.println(p1.getCount());
		System.out.println(p1.getPrice());
		int total = p1.getCount()*p1.getPrice();
		System.out.println(total);
		System.out.println(p1);

	}
}

/*
PersonTest02.java:16: error: name has private access in Person
                p1.name = "ȫ�浿";
                  ^
PersonTest02.java:17: error: age has private access in Person
                p1.age =20;
                  ^
PersonTest02.java:19: error: name has private access in Person
                System.out.println(p1.name);
                                     ^
PersonTest02.java:20: error: age has private access in Person
                System.out.println(p1.age);
                                     ^
4 errors
personŬ������ private������ �Ӽ�(�������)��
���� ������ �� ����.

������ �� �ִ� �޼ҵ带 public�� �����ΰ� ����ؾ� �Ѵ�.
�����ؼ� ���� �����ϴ� �޼ҵ�� setxxx���� �����
�����ؼ� ���� �о���� �޼ҵ�� getxxx�� �����.

�̰��� setter,getter��� �θ���.

����, Ŭ������ ���鶧
������ ��� ����������� private������ �ΰ�
�� private������ ��������� �����ϱ� ����
setter,getter�� public�� ��� �����Ѵ�.

*/