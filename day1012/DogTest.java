class Dog
{
	private String name;
	public String breed;
	private int age;

	Dog(String name,int age){
		this(name,null,age);
	}
	Dog(String name,String breed,int age){
		this.name=name;
		this.breed=breed;
		this.age=age;
	}

	public String toString(){
		String result = "�������̸�:"+this.name+"\n����������:"+this.breed+"\n����:"+this.age;	
		return result;
	}

}

class DogTest
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("����",5);
		Dog d2 = new Dog("����","�����ڱ�",7);

		System.out.println(d1);
		System.out.println(d2);



	}
}
