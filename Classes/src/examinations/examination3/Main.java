package examinations.examination3;

public class Main {

	public static void main(String[] args) {
		Student s0 = new Student("0000", "����", null);
		s0.computeExam();
		s0.printExam();

		Examin khr = new Examin(3);
		khr.setScore(0, "����", 71);
		khr.setScore(1, "����", 81);
		khr.setScore(2, "����", 91);
		Student s1 = new Student("1000", "������", khr);
		s1.computeExam();
		s1.printExam();
		
		Examin lss = new Examin(4);
		lss.setScore(0, "����", 100);
		lss.setScore(1, "����",  70);
		lss.setScore(2, "����", 100);
		lss.setScore(3, "����", 100);
		Student s2 = new Student("2000", "�̼���", lss);
		s2.computeExam();
		s2.printExam();
	}

}
