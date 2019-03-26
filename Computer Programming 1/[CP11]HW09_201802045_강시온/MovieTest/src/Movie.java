
public class Movie {
	private String title;
	private String producer;
	private String company;
	
	public String getTitle() {				//title 접근자
		return title;
	}

	public void setTitle(String title) {	//title 설정자
		this.title = title;
	}

	public String getProducer() {			//producer 접근자
		return producer;
	}

	public void setProducer(String producer) {		//producer 설정자
		this.producer = producer;
	}

	public String getCompany() {			//company 접근자
		return company;
	}

	public void setCompany(String company) {	//company 설정자
		this.company = company;
	}

	public Movie() {						//0개 인자 생성자
		title = "The Holiday";
		producer = "Nancy Meyers";
		company = "Columbia Pictures";
	}
	
	public Movie(String t, String p, String c) {	//3개 인자 생성자
		title = t;
		producer = p;
		company = c;
	}
}
