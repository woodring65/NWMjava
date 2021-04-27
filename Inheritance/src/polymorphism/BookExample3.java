/*
 * 1. �θ��� Ÿ������ �ڽİ�ü�� �ڵ� Ÿ�� ��ȯ
 * 2. �θ��� ��ü�� �ڽ� Ÿ������ ���� �� ����.
 */
package polymorphism;

public class BookExample3 {

	public static void main(String[] args) {
		Book book = new Book("ȫ�浿��", "����", "���", 0.0); 
		
		EBook ebook = new EBook("���޷� ��", 
				"����", 
				"��ҿ�", 
				20.5, 
				"����å");
		
		Novel novel = new Novel("�¹���", 
				"�Ҽ�", 
				"������", 
				20.5, 
				"�ع� ������ �̳�� ������ ��");

		printBookInfo(book);
		printEBookInfo(ebook);
		printNovelInfo(novel);
	}
	
	static void printBookInfo(Book book) {
		System.out.println("[��������]");
		System.out.println(book);
	}

	static void printEBookInfo(EBook book) {
		System.out.println("[����å����]");
		System.out.println(book);
	}

	static void printNovelInfo(Novel book) {
		System.out.println("[�Ҽ�å����]");
		System.out.println(book);
	}
}
