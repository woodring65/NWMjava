package books;

public class Book {
	String name;		// å��
	String category;	// �帣
	String author;		// ����
	double price;		// å�� ����($)

	public Book() {}
	
	public Book(String name, String category, String author, double price) {
		this.name = name;
		this.category = category;
		this.author = author;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		String str = String.format("[Book] �̸�(%s), �з�(%s), ����(%s), ����(%f)\n",
				name, category, author, price);
		
		return str;
	}
}
