/*
 * 1. �θ��� Ÿ������ �ڽİ�ü�� �ڵ� Ÿ�� ��ȯ
 */
package polymorphism;

public class BookExample {

	public static void main(String[] args) {
		EBook ebook = new EBook("���޷� ��", "����", "��ҿ�", 20.5, "����å");
		Novel novel = new Novel("�¹���", "�Ҽ�", "������", 20.5, "�ع� ������ �̳�� ������ ��");

		System.out.println(ebook);
		System.out.println(novel);
	}

}
