class A{
	public A(int i){
		System.out.println("A");
	}
	public A(){
		System.out.println("A�� �⺻������ ������");
	}
}

class B extends A
{
	public B(){
		//super();����
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
->�ڽ�Ŭ���� �������� ù��° �ٿ���
�θ�Ŭ������ �⺻�����ڸ� �䱸�ϴ� super()�� �����Ǿ� �ִ�.
�׷��� �θ�Ŭ���� AŬ������ �⺻�����ڰ� �����Ƿ� ������ �߻�.

->�θ�Ŭ������ �⺻�����ڸ� ����� �ְų�
->�ڽ�Ŭ������ �����ڿ��� �θ�Ŭ������ �Ű������� ���� �����ڸ� �䱸�ؾ���


*/

