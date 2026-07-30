package ClassName;

public class Comments {
	private int id;
	private String author;
	private String content;
	private String date;
	
	public Comments() {
		// TODO Auto-generated constructor stub
	}

	public Comments(int id, String author, String content, String date) {
		super();
		this.id = id;
		this.author = author;
		this.content = content;
		this.date = date;
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

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Comments [id=" + id + ", author=" + author + ", content=" + content + ", date=" + date + "]";
	}
	
}
