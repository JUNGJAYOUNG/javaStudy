class A{
	public A(){
		System.out.println("A");
	}
}

class B extends A
{
	public B(){
		//super();»ý·«
		System.out.println("B");
	}

}


class InheritanceTestConstructor
{
	public static void main(String[] args) 
	{
		B ob = new B();
	}
}
