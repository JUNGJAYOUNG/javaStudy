class Dog
{
	private String name;
	public String breed;
	private int age;

	public Dog(String name,int age,String breed){
	  this.name = name;
	  this.age = age;
	  this.breed = breed;
	}

	public String toString(){
		String result = "�������̸�:"+this.name+"\n����������:"+this.breed+"\n����:"+this.age;	
		return result;
	}

}

class DefaultConstructor01
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		System.out.println(d1);
	}
}
