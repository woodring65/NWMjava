package examinations.examination2;

public class Main {

	public static void main(String[] args) {
		Examin examKHR = new Examin(90,90,90);
		Student s1 = new Student("1000", "������", examKHR);
		s1.computeExam();
		s1.printExam();
		System.out.printf("������: ����(%d), ���(%f)\n", examKHR.total(), examKHR.avg());
		System.out.println("-----------------------------------");
		
		Student s2 = new Student("2000", "���α�", new Examin(80,90,100));
		s2.computeExam();
		s2.printExam();
		
		Student s3 = new Student("3000", "�輼��");
		s3.exam = new Examin();
		s3.exam.setKor(81);
		s3.exam.setEng(82);
		s3.exam.setMath(83);
		s3.computeExam();
		s3.printExam();

		Student s4 = new Student("4000", "�����");
		Examin examS4 = new Examin(40, 50, 60);
		s4.setExamin(examS4);
		s4.computeExam();
		s4.printExam();
		
		Student s5 = new Student("5000", "�����");
		s5.setExamin(new Examin(60,70,80));
		s5.computeExam();
		s5.printExam();
		
	}

}
