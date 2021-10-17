class A{
	public A(int i){
		System.out.println("A");
	}
	public A(){
		System.out.println("A의 기본생성자 동작함");
	}
}

class B extends A
{
	public B(){
		//super();생략
		System.out.println("B");
	}

}


class InheritanceTestConstructor02
{
	public static void main(String[] args) 
	{
		B ob = new B();
	}
}
/*
InheritanceTestConstructor02.java:9: error: constructor A in class A cannot be applied to given types;
        public B(){
                  ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
->자식클래스 생성자의 첫번째 줄에는
부모클래스의 기본생성자를 요구하는 super()가 생략되어 있다.
그런데 부모클래스 A클래스에 기본생성자가 없으므로 오류가 발생.

->부모클래스에 기본생성자를 만들어 주거나
->자식클래스의 생성자에서 부모클래스의 매개변수를 갖는 생성자를 요구해야함


*/

