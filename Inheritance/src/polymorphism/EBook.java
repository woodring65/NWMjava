package polymorphism;

public class EBook extends Book {
	private String title;
	
	public EBook() {}

	public EBook(String name, String category, String author, double price) {
		super(name, category, author, price);  // �θ������ ȣ��
	}

	public EBook(String name, String category, String author, double price, String title) {
		super(name, category, author, price);  // �θ������ ȣ��
		this.setTitle(title);
	}

	void setTitle(String title) {
		this.title = "CD-" + title;
	}
	
	String getTitle() {
		return title;
	}
	
	public String toString() {
		String str = String.format("[EBook] �̸�(%s), �з�(%s), ����(%s), ����(%f), Ÿ��Ʋ(%s)\n",
				name, category, author, price, title);
		
		return str;
	}
	
}
