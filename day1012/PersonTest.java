class Person{

	String name;
	int age;

}

class PersonTest{

	public static void main(String[] args){

		Person p1;

		p1=new Person(); //Person클래스형 객체를 생성하여 p1이 참조
		
		p1.name = "홍길동";
		p1.age =20;
		
		System.out.println(p1.name);
		System.out.println(p1.age);

	}
}