package entity;

public class news implements inews {
	int id;
	String title;
	String publishdate;
	String author;
	String content;
	float averagerate;
	int [] rates;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAveragerate() {
		return averagerate;
	}
	@Override
	public String toString() {
		return "news [id=" + id + ", title=" + title + ", publishdate=" + publishdate + ", author=" + author
				+ ", content=" + content + ", averagerate=" + averagerate + "]";
	}
	public news(int id, String title, String publishdate, String author, String content, float averagerate) {
		super();
		this.id = id;
		this.title = title;
		this.publishdate = publishdate;
		this.author = author;
		this.content = content;
		this.averagerate = averagerate;
	}
	public news() {
		super();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("id"+id);
		System.out.println("title"+ title);
		System.out.println("publishdate"+ publishdate); 
	}
	@Override
	public float calculate() {
		// TODO Auto-generated method stub
		averagerate = (float) (rates[1] + rates[2] + rates[3]) / 3 ;
		return averagerate;
		
	}
	
	
}
