class Product{

	private String name;
	private int count;
	private int price;

	//��� ���� name�� ���� ����(����)�ϴ� �޼ҵ带 ����
	public void setName(String n){
		//������� name�� �Ű������� ���޹��� n���� ����
		this.name = n;
		return;//(�����Ǿ�����, ���ϰ��� ����)
	}

	public String getName(){
		return this.name; //���ϰ��� �ִ�
	}
	
	public void setCount(int n){
		this.count = n;
		return;//�����Ǿ��ִ�.
	}
	public int getCount(){
		return this.count;
	}

	public void setPrice(int n){
		this.price = n;
		return;//�����Ǿ��ִ�.
	}
	public int getPrice(){
		return this.price;
	}

	public String toString(){
		String result="";
		result+="��ǰ��"+this.name+"\n";
		result+="����"+this.count+"\n";
		result+="����"+this.price+"\n";
		return result;
	}

}

class ProductTest02{

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