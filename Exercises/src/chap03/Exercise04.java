package chap03;

public class Exercise04 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// �л� �� ���� ������ ���� ��
		int pencilsPerStudent = (pencils / students); // ��
		System.out.println("pencilsPerStudent=" + pencilsPerStudent);
		
		// ���� �� ����
		int pencilsStudents = pencilsPerStudent * 30; // �˻�
		System.out.printf("pencilsStudents: pencils(%d), pencilsStudents(%d)\n", pencils, pencilsStudents);
		
		// ���� ���� ��
		int pencilsLeft = (pencils % students); // ������
		System.out.println("pencilsLeft=" + pencilsLeft);

	}

}
