package examinations.examination1;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("1000", "������", new Examin(100,100,100));
		Student s2 = new Student("2000", "���α�", new Examin(80,90,100));
		Student s3 = new Student("3000", "õ����", new Examin(100,80,70));
		Student s4 = new Student("4000", "�豸��", new Examin(100,100,100));
	
		s1.printExam();
		s2.printExam();
		s3.printExam();
		s4.printExam();
	}

}
