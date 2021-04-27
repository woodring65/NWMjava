/*
 * 1. �θ��� Ÿ������ �ڽİ�ü�� �ڵ� Ÿ�� ��ȯ
 * 2. �θ��� ��ü�� �ڽ� Ÿ������ ���� �� ����.
 */
package polymorphism;

public class BookExample5 {

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

		printBookInfo(book, "[��������]");
		printBookInfo(ebook, "[����å����]");
		printBookInfo(novel, "[�Ҽ�å����]");
	}
	
	static void printBookInfo(Book book, String caption) {
		System.out.println(book);
		System.out.println(caption);
	}
}
