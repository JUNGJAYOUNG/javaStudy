class Movie
{
	private String title;
	private String director;
	private String company;
	
	void setCompany(String com){
		company=com;
	}

	void setDirector(String dir){
		director=dir;
	}

	void setTitle(String title){
		this.title=title;
	}

	String getCompany(){
		return company;
	}

	String getDirector(){
		return director;
	}

	String getTitle(){
		return title;
	}


	Movie(){
		this("����","����","ȸ��");	//�ٸ� ������ ȣ��
	}

	Movie(String title,String director,String company){
		this.title=title;
		this.director=director;
		this.company=company;
	}

	public String toString(){
		String result = "����:"+this.title+"\n����:"+this.director+"\n���ۻ�:"+this.company;	
		return result;
	}

}

class MovieTest
{
	public static void main(String[] args) 
	{
	    Movie m1 = new Movie();
		Movie m2 = new Movie("�𰡵�","���¿�","������");

		System.out.println(m1.getTitle());
		System.out.println(m1.getDirector());

		System.out.println(m1);
		System.out.println(m2);

	}
}
