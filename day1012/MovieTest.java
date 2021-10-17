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
		this("제목","감독","회사");	//다른 생성자 호출
	}

	Movie(String title,String director,String company){
		this.title=title;
		this.director=director;
		this.company=company;
	}

	public String toString(){
		String result = "제목:"+this.title+"\n감독:"+this.director+"\n제작사:"+this.company;	
		return result;
	}

}

class MovieTest
{
	public static void main(String[] args) 
	{
	    Movie m1 = new Movie();
		Movie m2 = new Movie("모가디슈","류승완","덱스터");

		System.out.println(m1.getTitle());
		System.out.println(m1.getDirector());

		System.out.println(m1);
		System.out.println(m2);

	}
}
