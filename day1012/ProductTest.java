class Product{

	private String name;
	private int count;
	private int price;

	//멤버 변수 name의 값을 설정(변경)하는 메소드를 정의
	public void setName(String n){
		//멤버변수 name을 매개변수로 전달받은 n으로 설정
		name = n;
		return;//(생략되어있음, 리턴값이 없다)
	}

	public String getName(){
		return name; //리턴값이 있다
	}
	
	public void setCount(int n){
		count = n;
		return;//생략되어있다.
	}
	public int getCount(){
		return count;
	}

	public void setPrice(int n){
		price = n;
		return;//생략되어있다.
	}
	public int getPrice(){
		return price;
	}

	public String toString(){
		String result="";
		result+="상품명"+name+"\n";
		result+="수량"+count+"\n";
		result+="가격"+price+"\n";
		return result;
	}

}

class ProductTest{

	public static void main(String[] args){

		Product p1;

		p1=new Product(); //Person클래스형 객체를 생성하여 p1이 참조
		
		//p1.name = "홍길동";
		//p1.age =20;
		
		p1.setName("아이폰13");
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
                p1.name = "홍길동";
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
person클래스의 private영역인 속성(멤버변수)에
직접 접근할 수 없다.

접근할 수 있는 메소드를 public에 만들어두고 사용해야 한다.
접근해서 값을 변경하는 메소드는 setxxx으로 만들고
접근해서 값을 읽어오는 메소드는 getxxx로 만든다.

이것을 setter,getter라고 부른다.

따라서, 클래스를 만들때
보통은 모든 멤버변수들은 private영역에 두고
그 private영역의 멤버변수에 접근하기 위한
setter,getter를 public에 모두 선언한다.

*/