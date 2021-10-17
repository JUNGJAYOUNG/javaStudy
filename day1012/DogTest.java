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
		String result = "강아지이름:"+this.name+"\n강아지종류:"+this.breed+"\n나이:"+this.age;	
		return result;
	}

}

class DogTest
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("쫑이",5);
		Dog d2 = new Dog("초코","웰시코기",7);

		System.out.println(d1);
		System.out.println(d2);



	}
}
